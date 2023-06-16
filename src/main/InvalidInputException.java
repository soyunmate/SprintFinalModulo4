package main;

public class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidInputException(String exceptionText){
		super(exceptionText);
	}

}
