package com.capgemini.bankappjdbc.dao;

import java.util.List;

import com.capgemini.bankappjdbc.model.BankAccount;

public interface BankAccountDao {
	

	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
	public boolean deleteAccount(long accountId);
	public boolean addNewBankAccount(BankAccount account);
	public List<BankAccount> findAllBankAccounts();
	public BankAccount searchBankAccount(long accountId);
	public boolean updateBankAccountDetails(long accountId,String updateName,String updateAccountType);
}
