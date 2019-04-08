package com.capgemini.bankappjdbc.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bankappjdbc.dao.BankAccountDao;
import com.capgemini.bankappjdbc.exceptions.BankAccountNotFoundException;
import com.capgemini.bankappjdbc.exceptions.LowbalanceException;
import com.capgemini.bankappjdbc.impl.BankAccountDaoImpl;
import com.capgemini.bankappjdbc.model.BankAccount;
import com.capgemini.bankappjdbc.service.BankAccountService;
import com.capgemini.bankappjdbc.util.DataBaseUtil;

public class BankAccountServiceImpl implements BankAccountService {

	static final Logger logger = Logger.getLogger(BankAccountServiceImpl.class);
	private BankAccountDao bankAccountDao;

	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();
	}

	@Override
	public double chechBalance(long accountId) throws BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance > 0)
			return balance;
		else
			throw new BankAccountNotFoundException("BankAccount doesn't exist....");
	}

	@Override
	public double withdraw(long accountId, double amount) throws LowbalanceException, BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("BankAccount doesn't exist....");
		if (balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			DataBaseUtil.commit();
			return balance;
		} else
			throw new LowbalanceException("You don't have sufficient Funds..!!!!");
	}

	public double withdrawForFundTransfer(long accountId, double amount)
			throws LowbalanceException, BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("BankAccount doesn't exist....");
		if (balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			return balance;
		} else
			throw new LowbalanceException("You don't have sufficient Funds..!!!!");
	}

	@Override
	public double deposite(long accountId, double amount) throws BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("BankAccount Doesn't exist...");
		balance = balance + amount;
		bankAccountDao.updateBalance(accountId, balance);
		DataBaseUtil.commit();
		return balance;
	}

	@Override
	public boolean deleteAccount(long accountId) throws BankAccountNotFoundException {

		boolean result = bankAccountDao.deleteAccount(accountId);
		if (result) {
			DataBaseUtil.commit();
			return result;
		} else
			throw new BankAccountNotFoundException("BankAccount doesn't exist....");
	}

	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount)
			throws LowbalanceException, BankAccountNotFoundException {
		try {
			double newBalance = withdrawForFundTransfer(fromAccount, amount);
			deposite(toAccount, amount);
			DataBaseUtil.commit();
			return newBalance;
		} catch (BankAccountNotFoundException | LowbalanceException e) {
			logger.error("Exception: ", e);
			DataBaseUtil.rollback();
			throw e;
		}

	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {

		// boolean result = bankAccountDao.addNewBankAccount(account);
//		if (result) {
//		DataBaseUtil.commit();
//		return result;
//		}
		// return false;
		return bankAccountDao.addNewBankAccount(account);
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {

		return bankAccountDao.findAllBankAccounts();
	}

	@Override
	public boolean updateBankAccountDetails(long accountId,String updateName,String updateAccountType) {
		//BankAccount account=bankAccountDao.searchBankAccount(accountId);
		if(bankAccountDao.updateBankAccountDetails(accountId, updateName, updateAccountType)) {
			DataBaseUtil.commit();
			return true;
		}
		else
			return false;
	}

	@Override
	public BankAccount searchBankAccount(long accountId) throws BankAccountNotFoundException {
		BankAccount result = bankAccountDao.searchBankAccount(accountId);
		if (result != null)
			return result;
		else
			throw new BankAccountNotFoundException("BankAccount Doesn't exist..");
	}

}
