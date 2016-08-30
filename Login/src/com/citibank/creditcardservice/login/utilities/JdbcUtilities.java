package com.citibank.creditcardservice.login.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtilities {
	
	public Connection createMySqlConnection(String dataBaseURL,String userName,String password)
	{
		Connection Connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection = DriverManager.getConnection(dataBaseURL,userName,password);
			} catch (SQLException e) {
				System.out.println("Connection Problem");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Loaded");
			e.printStackTrace();
			 
		}
		
		
		return	Connection;
	}
}
