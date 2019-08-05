package com.mphasis.rethrow;

public class Rethrow {
	public void doRethrow(String exceptionName) throws FirstException,SecondException{
		
		if(exceptionName.contains("First")) {
			throw new FirstException("Message from the First Exception");
		}else
		if(exceptionName.contains("Second")) {
			throw new SecondException("Message from the Second Exception");
		}
		
	}
}
