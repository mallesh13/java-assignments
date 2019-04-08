package com.capgemini.bankappjdbc.service;

import java.util.List;

import com.capgemini.bankappjdbc.exceptions.BankAccountNotFoundException;
import com.capgemini.bankappjdbc.exceptions.LowbalanceException;
import com.capgemini.bankappjdbc.model.BankAccount;

public interface BankAccountService {

	public double chechBalance(long accountId) throws BankAccountNotFoundException;

	public double withdraw(long accountId, double amount) throws LowbalanceException, BankAccountNotFoundException;

	public double deposite(long accountId, double amount) throws BankAccountNotFoundException;

	public boolean deleteAccount(long accountId)throws BankAccountNotFoundException;

	public boolean updateBankAccountDetails(long accountId, String updateName, String updateAccountType);

	public double fundTransfer(long fromAccount, long toAccount, double amount) throws LowbalanceException,BankAccountNotFoundException;

	public boolean addNewBankAccount(BankAccount account);

	public List<BankAccount> findAllBankAccounts();
	
	public BankAccount searchBankAccount(long accountId) throws BankAccountNotFoundException;

}
