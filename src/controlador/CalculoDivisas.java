package controlador;

import interfaces.InterfazDivisas;

public class CalculoDivisas implements InterfazDivisas {

	private final double CONVERSOR_EURO_DOLLAR = 1.207;
    private final double CONVERSOR_DOLLAR_EURO = 0.827;

	@Override
	public double convertirEurosDollars(double cantidad) {
		return cantidad * CONVERSOR_EURO_DOLLAR;
	}

	@Override
	public double convertirDollarsEuros(double cantidad) {
		return cantidad * CONVERSOR_DOLLAR_EURO;
	}
	
}
