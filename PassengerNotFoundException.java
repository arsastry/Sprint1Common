package com.capg.Exceptions;

public class PassengerNotFoundException extends RuntimeException{
	
	private String message;
	
	public PassengerNotFoundException() {
		
	}
	
	public PassengerNotFoundException(String message) {
		super(message);
		this.message=message;
	}
	
}
