package com.capgemini.bankappjdbc.exceptions;

public class LowbalanceException extends Exception {

	public LowbalanceException() {
		
	}
	public LowbalanceException(String message) {
		super(message);
	}
}
