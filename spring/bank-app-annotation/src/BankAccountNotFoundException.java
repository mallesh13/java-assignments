package com.capgemini.bankappjdbc.exceptions;

public class BankAccountNotFoundException extends Exception {
	public BankAccountNotFoundException() {
		
	}

	public BankAccountNotFoundException(String message) {
		super(message);
	}
}
