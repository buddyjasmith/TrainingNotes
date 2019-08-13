package com.edunext.customerexception;

public class LateRegistrationException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	public LateRegistrationException() {
		super();
	}
	public LateRegistrationException(String message) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Registration Failed";
	}

	
}
