package com.capgemini.bankappjdbc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.bankappjdbc.client.*;
import com.capgemini.bankappjdbc.dao.BankAccountDao;
import com.capgemini.bankappjdbc.model.BankAccount;
import com.capgemini.bankappjdbc.util.DataBaseUtil;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class BankAccountDaoImpl implements BankAccountDao {

	private DataBaseUtil dataBaseUtil;
	
	@Autowired
	public BankAccountDaoImpl(DataBaseUtil dataBaseUtil){
		this.dataBaseUtil = dataBaseUtil;
	}

	@Override
	public double getBalance(long accountId) {
		String query = "SELECT account_balance FROM bankaccounts WHERE accountId=" + accountId;
		double balance = -1;
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {

			while (result.next()) {
				balance = result.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;

	}

	@Override
	public void updateBalance(long accountId, double newBalance) {

		String query = "UPDATE bankaccounts SET account_balance=? WHERE accountId=?";
		int resultSet;
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setDouble(1, newBalance);
			statement.setLong(2, accountId);

			resultSet = statement.executeUpdate();
			System.out.println("No. of rows Updated : " + resultSet);
			if (resultSet == 0)
				System.out.println("accountId not found");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean deleteAccount(long accountId) {
		String query = "DELETE FROM bankaccounts WHERE accountId=?";
		int resultSet;
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setLong(1, accountId);
			resultSet = statement.executeUpdate();
			if (resultSet == 1)
				return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		String query = "INSERT INTO bankaccounts(customer_name,account_type,account_balance) VALUES(?,?,?)";
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, account.getAccountHolderName());
			statement.setString(2, account.getAccountType());
			statement.setDouble(3, account.getAccountBalance());
			int result = statement.executeUpdate();
			if (result == 1) {
				//DataBaseUtil.commit();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {

		String query = "SELECT * FROM bankaccounts";
		List<BankAccount> accountsList = new ArrayList<BankAccount>();
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet set = statement.executeQuery()) {

			while (set.next()) {

				long account_id = set.getLong(1);
				String customer_name = set.getString(2);
				String account_type = set.getString(3);
				double balance = set.getDouble(4);
				BankAccount account = new BankAccount(account_id, customer_name, account_type, balance);
				accountsList.add(account);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accountsList;
	}

	@Override
	public BankAccount searchBankAccount(long accountId) {
		String query = "SELECT * FROM bankaccounts WHERE accountId=" + accountId;
		BankAccount details = null;
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				details = new BankAccount(resultSet.getLong(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return details;
	}

	@Override
	public boolean updateBankAccountDetails(long accountId,String updateName,String updateAccountType) {
		String query = "UPDATE bankaccounts SET customer_name=?,account_type=? WHERE accountId=?";
		Connection connection = DataBaseUtil.getConnection();
		try (PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setString(1, updateName);
			statement.setString(2, updateAccountType);
			statement.setLong(3, accountId);
			int result = statement.executeUpdate();
			System.out.println("No. of rows Updated : " + result);
			if (result == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
