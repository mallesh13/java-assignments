package com.capgemini.bankappjdbc.service;

import com.capgemini.bankappjdbc.exceptions.LowbalanceException;

public interface BankAccountService {

	public double chechBalance(long accountId);
	public double withdraw(long accountId,double amount) throws LowbalanceException;
	public double deposite(long accountId,double amount);
	public boolean deleteAccount(long accountId);
	
}
