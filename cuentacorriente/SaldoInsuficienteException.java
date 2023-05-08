package edu.kiara.daw.tema8.cuentacorriente;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super();
	}

	public SaldoInsuficienteException(String message) {
		super(message);
	}

	public SaldoInsuficienteException(String message, Throwable e) {
		super(message, e);
	}
}
