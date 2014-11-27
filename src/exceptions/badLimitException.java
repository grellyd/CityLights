package exceptions;

public class BadLimitException extends Exception {
	
	private static final String errorMessage = "Error: Size of Table must be greater than 0.";
	
	public String message() {
		return errorMessage;
	}

}
