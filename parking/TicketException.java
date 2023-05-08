package edu.alonso.daw.tema8.parking;

public class TicketException extends Exception{

	private static final long serialVersionUID = 5698563169360543497L;

	public TicketException() {
		super();
	}

	public TicketException(String message) {
		super(message);
	}

	public TicketException(String message, Throwable e) {
		super(message, e);
	}
}
