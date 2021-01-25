<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>CONVERSOR DIVISAS - ALICIA MORILLO</title>
		
		<link rel="stylesheet" type="text/css" href="css/estilos.css"/>
			
		<script type="text/javascript" src="js/externalJS.js"></script>
		
	</head>
	
	<body>
	
		<div align="center">
		
		<fieldset>
		
		<h1 style="color: #0080c0;font-size: 60px; border-color: black"> CONVERSOR DE MONEDA </h1>
			
		<img id="foto" src="imagenes/eurodolar.png"/>
		
		<form action="" method="GET" id="formulario">
		
			<br/><br/>
			
			<label id="cantidadInicial">INTRODUCE LA CANTIDAD A CONVERTIR:</label>
				
				<input type="text" name="cajaCantidad" id="cajaCantidad" value="" size="6" maxlength="5" required autofocus/>
			
			<br/><br/>
			
			<button type="submit" class="boton" name="divisa" id="EuroDollar" onclick="enviar(this);">
				EURO A DÓLAR
			</button>
	            &nbsp;&nbsp;&nbsp;
	            
	        <button type="submit" class="boton" name="divisa" id="DollarEuro" value="" onclick="enviar(this);">
	        	DÓLAR A EURO
	        </button>        
	            
	        <br/><br/><br/>
	        
	        <img src="imagenes/converterIcon.png" onclick="recargarPagina()"/>
	        
	        <br/><br/>
        
        <label>- RESULTADO -</label>
        <div id="cajaResultado">${param.resultado}</div>
        
        <input type="reset" class="botonBorrar" value="BORRAR DATOS"/>        
		
		</form>
		
		</fieldset>
		
		</div>
	
	</body>
	
</html>