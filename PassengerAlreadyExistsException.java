package com.capg.Exceptions;

public class PassengerAlreadyExistsException extends RuntimeException{
	
	private String message;

	public PassengerAlreadyExistsException() {

	}

	public PassengerAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
}
