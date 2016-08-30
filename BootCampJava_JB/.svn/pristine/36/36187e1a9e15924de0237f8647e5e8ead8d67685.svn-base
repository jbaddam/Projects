package com.bootcamp.employeesurvey.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.bootcamp.employeesurvey.utilities.Employee;

/**
 * @author Jagan Reddy
 *
 */
public class EmployeeInfoDAO {

	/**
	 * @param info
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * 
	 * This method will take the Employee object and stores data in database
	 * if data stored successfully in the database in it return true
	 */
	public boolean storeInDataBase(Employee info)
			
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "admin");

			PreparedStatement updateemp = con.prepareStatement("insert into employeeinfo values(?,?,?,?,?)");

			updateemp.setString(1, info.getExperience());
			updateemp.setString(2, info.getJ2eeTechnolgy());
			updateemp.setString(4, info.getFramework());
			updateemp.setString(3, info.getWebservice());
			updateemp.setString(5, info.getComments());
			updateemp.executeUpdate();
			
			con.close();

		} catch (SQLException e) {

			System.out.println("Database problem");
			return false;
		}

		return true;

	}
	
	public String gerFrameworks(){
		String frameworks = "";
		
		
		
		return frameworks;
		
	}

}
