package com.mphasis.exceptionpack;

public class InsuffecientLeaveException extends Exception /*compile time-checked**/{
	private String message;
	public InsuffecientLeaveException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
