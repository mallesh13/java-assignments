package com.capgemini.bankapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.bankappjdbc.exceptions.BankAccountNotFoundException;
import com.capgemini.bankappjdbc.exceptions.LowbalanceException;
import com.capgemini.bankappjdbc.model.BankAccount;
import com.capgemini.bankappjdbc.service.BankAccountService;
import com.capgemini.bankappjdbc.service.impl.BankAccountServiceImpl;


@WebServlet(urlPatterns = "*.do", loadOnStartup = 1)
public class BankAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BankAccountService bankService;

	public BankAccountController() {
		bankService = new BankAccountServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	 	String path = request.getServletPath();

		if (path.equals("/details.do")) {

			List<BankAccount> bankAccounts = bankService.findAllBankAccounts();
			RequestDispatcher dispatcher = request.getRequestDispatcher("details.jsp");

			request.setAttribute("accounts", bankAccounts);
			dispatcher.forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		System.out.println(path);

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		if (path.equals("/openNewBankAccount.do")) {
			String customerName = request.getParameter("name");
			String accountType = request.getParameter("account_type");
			double accountBalance = Double.parseDouble(request.getParameter("balance"));

			BankAccount account = new BankAccount(customerName, accountType, accountBalance);
			if (bankService.addNewBankAccount(account)) {
				writer.println("<h2>BankAccount Created Successful...!!!<h2>");
				writer.close();
			}
		}

		if (path.equals("/withdraw.do")) {
			long accountId = Long.parseLong(request.getParameter("acountnumber"));
			double amount = Double.parseDouble(request.getParameter("amount"));
			try {
				bankService.withdraw(accountId, amount);
				writer.println("<h2>Amount withdraw Successful...!!!<h2>");
				writer.close();
			} catch (LowbalanceException | BankAccountNotFoundException e) {
				e.printStackTrace();
			}
		}

		if (path.equals("/deposit.do")) {
			long accountId = Long.parseLong(request.getParameter("acountnumber"));
			double amount = Double.parseDouble(request.getParameter("amount"));
			try {
				bankService.deposite(accountId, amount);
				writer.println("<h2>Amount deposit Successful...!!!<h2>");
				writer.close();
			} catch (BankAccountNotFoundException e) {
				e.printStackTrace();
			}
		}

		if (path.equals("/checkbalance.do")) {
			long accountId = Long.parseLong(request.getParameter("acountnumber"));

			try {
				double amount = bankService.chechBalance(accountId);
				writer.println("<h2>check balance Successful...!!!<h2>" + "balance=" + amount);
				writer.close();
			} catch (BankAccountNotFoundException e) {
				e.printStackTrace();
			}
		}

		if (path.equals("/deleteaccount.do")) {
			long accountId = Long.parseLong(request.getParameter("acountnumber"));

			try {
				bankService.deleteAccount(accountId);
				writer.println("<h2>Account deleted Successful...!!!<h2>");
				writer.close();
			} catch (BankAccountNotFoundException e) {
				e.printStackTrace();
			}
		}

		if (path.equals("/fundtransfer.do")) {
			long fromaccountId = Long.parseLong(request.getParameter("fromaccountnumber"));
			long toaccountId = Long.parseLong(request.getParameter("toaccountnumber"));
			double amount = Double.parseDouble(request.getParameter("amount"));
			try {
				bankService.fundTransfer(fromaccountId, toaccountId, amount);
				writer.println("<h2>Amount transfer Successful...!!!<h2>");
				writer.close();
			} catch (BankAccountNotFoundException | LowbalanceException e) {
				e.printStackTrace();
			}
		}

		if (path.equals("/searchaccount.do")) {

			long accountId = Long.parseLong(request.getParameter("acountnumber"));

			try {
				BankAccount account = bankService.searchBankAccount(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("getaccountdetails.jsp");

				request.setAttribute("account", account);
				dispatcher.forward(request, response);

			} catch (BankAccountNotFoundException e) {
				writer.println("<h2>Account Not Found...!!!<h2>");
				writer.close();
			}
		}

		if (path.equals("/fetchingupdatedetails.do")) {
			long accountId = Long.parseLong(request.getParameter("accountnumber"));

			try {
				BankAccount account = bankService.searchBankAccount(accountId);
				RequestDispatcher dispatcher = request.getRequestDispatcher("getDetailsToUpdate.jsp");

				request.setAttribute("account", account);
				dispatcher.forward(request, response);

			} catch (BankAccountNotFoundException e) {
				writer.println("<h2>Account Not Found...!!!<h2>");
				writer.close();
			}
		}
		
		if(path.equals("/updateAccountDetails.do")) {
			long accountId = Long.parseLong(request.getParameter("accountId"));
			String customerName = request.getParameter("accountHolderName");
			String accountType = request.getParameter("accountType");
			
			if(bankService.updateBankAccountDetails(accountId, customerName, accountType)) {
			writer.println("<h2>Account Details Updated Successful...!!!<h2>");
			writer.close();
			}
		}
	}

}
