package com.capgemini.bankappjdbc.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.capgemini.bankappjdbc.client.*;
import org.apache.log4j.Logger;

public class DataBaseUtil {


	private static String driverClassName="com.mysql.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/bankappjdbcdb";
	private static String username="root";
	private static String password="root";
	static Connection connection;
	static final Logger logger = Logger.getLogger(DataBaseUtil.class);

	public static Connection getConnection() {

		try {
			Class.forName(driverClassName);
			if(connection==null) {
			connection = DriverManager.getConnection(dburl, username, password);
			connection.setAutoCommit(false);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void commit() {
		try {
			if (connection != null)
				connection.commit();
		} catch (SQLException e) {
			logger.error("SQL Exception : ", e);
		}
	}

	public static void rollback() {
		try {
			if (connection != null)
				connection.rollback();
		} catch (SQLException e) {
			logger.error("SQL Exception : ", e);
		}
	}

	/*
	 * static { try { File propertiesFile = new File("dbConfig.properties");
	 * FileReader fileReader = new FileReader(propertiesFile);
	 * 
	 * Properties properties = new Properties(); properties.load(fileReader);
	 * 
	 * driverClassName = properties.getProperty("driverClassName"); dburl =
	 * properties.getProperty("dataBaseUrl"); username =
	 * properties.getProperty("username"); password =
	 * properties.getProperty("password");
	 * 
	 * } catch (IOException e) { e.printStackTrace(); } }
	 */
}
