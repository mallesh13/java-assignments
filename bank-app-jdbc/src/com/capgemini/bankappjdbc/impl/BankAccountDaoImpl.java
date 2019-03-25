package com.capgemini.bankappjdbc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.bankappjdbc.dao.BankAccountDao;
import com.capgemini.bankappjdbc.util.DataBaseUtil;

public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public double getBalance(long accountId) {
		String query = "SELECT account_balance FROM bankaccounts WHERE account_id=" + accountId;
		double balance = 0;
		try (Connection connection = DataBaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			balance = resultSet.getDouble(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;

	}

	@Override
	public void updateBalance(long accountId, double newBalance) {

		String query = "UPDATE bankaccounts SET account_balance=? WHERE account_id=?";
		int resultSet;
		try (Connection connection = DataBaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

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
		String query = "DELETE FROM bankaccounts WHERE account_id=?";
		int resultSet;
		try (Connection connection = DataBaseUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setLong(1, accountId);
			resultSet = statement.executeUpdate();
			if (resultSet == 1)
				return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
