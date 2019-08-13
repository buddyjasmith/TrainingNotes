package com.edunext.customerexception;

public class InvalidRegistrationException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidRegistrationException() {
		super();
	}
	public InvalidRegistrationException(String message) {
		super(message);
		this.message = message;
		
		
	}
	@Override
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return message;
	}

}
