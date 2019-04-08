package com.capgemini.bankappjdbc.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		String dataBaseUrl = "jdbc:mysql://localhost:3306/bankappjdbcdb";
		String username = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dataBaseUrl, username, password);
			if (connection != null)
				System.out.println("connected");

		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load Diver class. Make sure that .class file is available.");
		} catch (SQLException e) {
			System.out.println("failed to connect");
			e.printStackTrace();
		}

	}
}
