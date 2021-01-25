//JAVASCRIPT:

function recargarPagina(){
	document.getElementById('cajaResultado').innerHTML = "";
	location.reload();
}


function enviar(queBoton){
	
	var cajaCantidad = document.getElementById("cajaCantidad");
	
	if(comprobacionValores()) {
		cajaCantidad.focus();					
		return;
	}
	
	var idBoton = queBoton.id;
	
	var urlPeticion = idBoton + "Servlet.do"
	
	var formularioPeticion = document.getElementById("formulario");
	
	formularioPeticion.action = urlPeticion;
	
	formularioPeticion.submit();
}


function comprobacionValores(){
	
	document.getElementById('cajaCantidad').style.backgroundColor="white";

	var cantidadIntroducida = document.getElementById("cajaCantidad").value;
	
	var cajaResultado = document.getElementById("cajaResultado");
    
    if ("" == cantidadIntroducida.trim()) {
        document.getElementById('cajaCantidad').style.backgroundColor="#ffb3b3";
        cajaResultado.innerHTML = "EL CAMPO CANTIDAD NO PUEDE ESTAR VACIO";
        return true;
    }
	
    if(isNaN(cantidadIntroducida)) {
        document.getElementById('cajaCantidad').style.backgroundColor="#ffb3b3";
        cajaResultado.innerHTML = "LA CANTIDAD INTRODUCIDA NO ES UN VALOR NUMERICO";
        return true;
    }
    
    if(parseInt(cantidadIntroducida) <= 0) {
        document.getElementById('cajaCantidad').style.backgroundColor="#ffb3b3";
        cajaResultado.innerHTML = "INTRODUCE UN VALOR MAYOR DE CERO";
        return true;
    }
    
    return false;
    
}


