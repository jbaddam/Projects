package com.bootcampjava.electricityservice.daos.fileprocessor;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.bootcampjava.electricityservice.models.fileprocessor.Customer;
import com.bootcampjava.electricityservice.utilities.JdbcUtility;
import com.bootcampjava.electricityservice.models.fileprocessor.Service;

/**
 * @author Jagan Reddy
 * This class has behaviors to store and retrieve the data from database
 */
public class FileProcessorDAO {
	
	JdbcUtility jdbcUtility = new JdbcUtility();
	
	

	/**
	 * @param Customer
	 * This method taking customer object as a parameter
	 *  and storing all its properties in database
	 */
	public  synchronized void storeCustomerInfo(Customer Customer){
		
		Connection connection = jdbcUtility.createConnection();
		CallableStatement statement = null;
		
			try {
				statement = connection.prepareCall("{call insertCustomersInfo(?, ?, ?, ?, ?, ?, ?)}");
				statement.setString(1, Customer.getFirstName());
				statement.setString(2, Customer.getLastName());
				statement.setString(3, Customer.getEmail());
				statement.setString(4, Customer.getPhone());
				statement.setString(5, Customer.getServiceInfo().getServiceID());
				statement.setDate(6, new Date(Customer.getServiceInfo().getStartDate().getTime()));
				statement.setDate(7, new Date(Customer.getServiceInfo().getEndDate().getTime()));				
				statement.executeUpdate();
				
				
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	/**
	 * @return
	 * This method retrieves all the customer data from database 
	 * and stores in a arraylist and return that list 
	 */
	public List<Customer> getAllCustomers(){
		
		List<Customer> customerList = new ArrayList<Customer>();
		Connection connection = jdbcUtility.createConnection();
		CallableStatement statement = null;
	
		try {
			
			statement = connection.prepareCall("{call getAllCustomers( )}");
							
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				
				Customer customer = new Customer();
				Service service = new Service();
				
				
				customer.setFirstName(rs.getString(1));
				customer.setLastName(rs.getString(2));
				customer.setEmail(rs.getString(3));
				customer.setPhone(rs.getString(4));
				
				service.setServiceID(rs.getString(5));
				service.setStartDate(rs.getDate(6));
				service.setEndDate(rs.getDate(7));
				
				customer.setServiceInfo(service);
				
				// adding customer object to list
				customerList.add(customer);
				
				
			}			
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return customerList;		
	}

	
	/**
	 * @return
	 * This method returns true if data delete from database
	 */
	public boolean dataClean(){
		Connection connection = jdbcUtility.createConnection();
		CallableStatement statement = null;
		
		int i =0;
		try {
			 statement = connection.prepareCall("{call cleanData()}");
			  i = statement.executeUpdate();
			  statement.close();
			  connection.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		if (i == 0)
			return true;
		else
			return false;

	}
	
}
