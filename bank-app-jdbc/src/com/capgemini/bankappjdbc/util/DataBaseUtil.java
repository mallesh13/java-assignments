package com.capgemini.bankappjdbc.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseUtil {

	private static String dburl;
	private static String username;
	private static String password;

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(dburl, username, password);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	static {
		try {
			File propertiesFile = new File("dbConfig,properties");
			FileReader fileReader = new FileReader(propertiesFile);

			Properties properties = new Properties();
			properties.load(fileReader);

			dburl = properties.getProperty("dataBaseUrl");
			username = properties.getProperty("username");
			password = properties.getProperty(password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
