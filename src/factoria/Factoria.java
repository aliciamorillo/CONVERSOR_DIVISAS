package factoria;

import controlador.CalculoDivisas;
import interfaces.InterfazDivisas;


public class Factoria {
	
	public static InterfazDivisas obtenerCalculadoraDivisas() {       
        return new CalculoDivisas();
    }

}
