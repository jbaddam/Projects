package com.bootcampjava.electricityservice.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Jagan Reddy
 * This class has functionality to connect to database
 */
public class JdbcUtility {

	/**
	 * @return
	 * This method return the connection object
	 */
	public Connection createConnection() {
		
		PropertiesUtility propUtility = new PropertiesUtility();

		Properties properties = propUtility.getProperies();
		
		Connection connection = null;
		
		try {
			
			// passing parameters by getting values from properties
			Class.forName(properties.getProperty("driver"));
			try {
				
				// passing parameters by getting values from properties
				connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
						properties.getProperty("password"));
			} catch (SQLException e) {
				System.out.println("Connection Problem");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Loaded");
			e.printStackTrace();

		}
		return connection;
	}
}
