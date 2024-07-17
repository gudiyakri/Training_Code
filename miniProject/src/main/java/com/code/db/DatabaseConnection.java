package com.code.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static Connection con;
//Define database driver,URL, username ,and password	
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";// JDBC driver class
	static final String URL = "jdbc:mysql://localhost:3306/miniDatabase";// Database URL
	static final String USERNAME = "root";// Database username
	static final String PASSWORD = "Gudiya@1234";// Database password

	// Method to connect a connection to the database
	public static Connection getConnection() {
		try {
			// Load the JDBC driver class
			Class.forName(DRIVER);
			// To establish a connection to database using DriverManager
			con= DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (Exception e) {
			// Handle any exceptions that occur during the database connection process

			System.out.println(e);
		
		}
		return con;
		
	}

	
	}
