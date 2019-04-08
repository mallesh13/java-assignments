package com.capgemini.bankappjdbc.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.log4j.Logger;

import com.capgemini.bankappjdbc.exceptions.BankAccountNotFoundException;
import com.capgemini.bankappjdbc.exceptions.LowbalanceException;
import com.capgemini.bankappjdbc.model.BankAccount;
import com.capgemini.bankappjdbc.service.BankAccountService;
import com.capgemini.bankappjdbc.service.impl.BankAccountServiceImpl;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class BankAccountClient {

	static final Logger logger = Logger.getLogger(BankAccountClient.class);
	

	public static void main(String[] args) throws IOException {

		int option;
		String accountHolderName;
		String accountType;
		double accountBalance;
		long accountId;
		double withdrawAmount;
		double depositAmount;
		long fromAccountId;
		long toAccountId;

		ApplicationContext context = new ClassPathXmlApplicationContext("bankbeans.xml");
		BankAccountService bankService =(BankAccountService)context.getBean("service");
		

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {

				System.out.println("1. Add new Account\n2. Withdraw\n3. Deposit\n4. Check Balance\n5. Fund Transfer\n"
						+ "6. Deleting Account\n7. Search Specific Account\n8. Display All Accounts\n"
						+ "9. Update Account details\n10. Exit");

				System.out.println("Enter your Option");
				option = Integer.parseInt(reader.readLine());
				switch (option) {
				case 1:
					System.out.println("Enter AccountHolderName : ");
					accountHolderName = reader.readLine();
					System.out.println("Enter Account Type : ");
					accountType = reader.readLine();
					System.out.println("Enter Balance: ");
					accountBalance = Double.parseDouble(reader.readLine());

					BankAccount newAccount = new BankAccount(accountHolderName, accountType, accountBalance);
					if (bankService.addNewBankAccount(newAccount))
						System.out.println("Account Created Successfully...!!");
					else
						System.out.println("Failed to Create Account");
					break;
				case 2:

					System.out.println("--You are in Withdraw section--");
					System.out.println("Enter account id: ");
					accountId = Long.parseLong(reader.readLine());

					System.out.println("Enter amount to Withdraw:");
					withdrawAmount = Double.parseDouble(reader.readLine());

					try {
						double amount = bankService.withdraw(accountId, withdrawAmount);
						System.out.println("Amount withdrawn: " + withdrawAmount + " from Account id:" + accountId);
						System.out.println("Available Balance:" + amount);
					} catch (LowbalanceException | BankAccountNotFoundException e) {
						logger.error("Exception :", e);
					}

					break;

				case 3:
					System.out.println("--You are in Deposit Section---");
					System.out.println("Enter account id: ");
					accountId = Long.parseLong(reader.readLine());

					System.out.println("Enter amount to Deposit:");
					depositAmount = Double.parseDouble(reader.readLine());

					try {
						System.out.println("Balance After deposit : " + bankService.deposite(accountId, depositAmount));
					} catch (BankAccountNotFoundException e) {
						logger.error("Exception :", e);

					}

					break;

				case 4:
					System.out.println("--You are in Check Balance Section---");
					System.out.println("Enter account id: ");
					accountId = Long.parseLong(reader.readLine());
					try {
						System.out.println(bankService.chechBalance(accountId));
					} catch (BankAccountNotFoundException e1) {
						logger.error("Exception :", e1);
					}
					break;

				case 5:
					System.out.println("--You are in Fund Transfer Section---");
					System.out.println("Enter fromAccount Id: ");
					fromAccountId = Long.parseLong(reader.readLine());
					
					System.out.println("Enter toAccount Id: ");
					toAccountId = Long.parseLong(reader.readLine());
					System.out.println("Enter amount: ");
					double amount=Double.parseDouble(reader.readLine());
					
					try {
						System.out.println(bankService.fundTransfer(fromAccountId, toAccountId, amount));
					} catch (LowbalanceException | BankAccountNotFoundException e1) {
						
						e1.printStackTrace();
					}
					break;

				case 6:
					System.out.println("--You are in Delete Account Section---");
					System.out.println("Enter Account Id to delete BankAccount: ");
					accountId = Integer.parseInt(reader.readLine());
					try {
						System.out.println(bankService.deleteAccount(accountId));
					} catch (BankAccountNotFoundException e) {

						logger.error("Exception :", e);
					}

					break;

				case 7:
					System.out.println("--You are in Searching Specific Account Details Section---");
					System.out.println("Enter Account Id : ");
					accountId = Integer.parseInt(reader.readLine());

					System.out.println("Details of Account" + accountId);
					try {
						System.out.println(bankService.searchBankAccount(accountId));
					} catch (BankAccountNotFoundException e) {

						logger.error("Exception :", e);
					}

					break;

				case 8:
					System.out.println("--You are in Display all Accounts Section--");
					List<BankAccount> list = bankService.findAllBankAccounts();

					for (BankAccount s : list) {
						System.out.println(s);
					}

					break;
				case 9:
					System.out.println("--You are in Update Account Section---");
					System.out.println("Enter Account Id to Update BankAccount: ");
					accountId = Integer.parseInt(reader.readLine());
				//	bankService.updateBankAccountDetails(accountId);

					break;
				case 10:
					System.out.println("Thanks For Using Our Service");
					System.exit(0);
				default:
					System.out.println("Enter Valid option");

				}

			}
		}
	}
}
