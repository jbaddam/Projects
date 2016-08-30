package com.citibank.creditcardservice.login.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.citibank.creditcardservice.login.utilities.Address;
import com.citibank.creditcardservice.login.utilities.Customer;
import com.citibank.creditcardservice.login.utilities.CustomerCredentials;
import com.citibank.creditcardservice.login.utilities.JdbcUtilities;

public class LoginDAO {

	public Customer getCustomerInfo(Customer custFromService) {

		Customer customerFromDB = new Customer();
		Address custAddress = new Address();
		CustomerCredentials custCredentials = new CustomerCredentials();
		JdbcUtilities util = new JdbcUtilities();

		Connection connection = util.createMySqlConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		PreparedStatement st = null;

		try {
			st = connection.prepareStatement("Select * from customer_login where userName = ?");
		} catch (SQLException e) {
			System.out.println("Query Caused Problem");
			e.printStackTrace();
		}
		try {
			st.setString(1, custFromService.getCustomerCredentials().getUserName());
		} catch (SQLException e) {
			System.out.println("Setting dynamic values to a query is causing problem");
			e.printStackTrace();
		}

		ResultSet rs = null;
		try {
			rs = st.executeQuery();
		} catch (SQLException e) {
			System.out.println("Excecuting Query Caused the problem");
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				customerFromDB.setfName(rs.getString(1));
				customerFromDB.setlName(rs.getString(2));

				custCredentials.setUserName(rs.getString(3));
				custCredentials.setPassword(rs.getString(4));

				custAddress.setStreet(rs.getString(5));
				custAddress.setCity(rs.getString(6));
				custAddress.setState(rs.getString(7));
				custAddress.setZip(rs.getString(8));

				customerFromDB.setCustomerAddress(custAddress);
				customerFromDB.setCustomerCredentials(custCredentials);

			}
			
			rs.close();
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return customerFromDB;
	}
	
	public boolean registerCustomer(Customer custFromService){
		
		JdbcUtilities util = new JdbcUtilities();
		int result = 0;

		Connection connection = util.createMySqlConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		PreparedStatement st = null;

		try {
			st = connection.prepareStatement("insert into customer_login values(?,?,?,?,?,?,?,?)");
		    st.setString(1, custFromService.getfName());
		    st.setString(2, custFromService.getlName());
		    
		    st.setString(3, custFromService.getCustomerCredentials().getUserName());
		    st.setString(4, custFromService.getCustomerCredentials().getPassword());
		    
		    st.setString(5, custFromService.getCustomerAddress().getStreet());
		    st.setString(6, custFromService.getCustomerAddress().getCity());
		    
		    st.setString(7, custFromService.getCustomerAddress().getState());
		    st.setString(8, custFromService.getCustomerAddress().getZip());
		    
		     result = st.executeUpdate();
		    
		    	
		
		} catch (SQLException e) {
			System.out.println("Query Caused Problem");
			e.printStackTrace();
		}
		try {
			st.setString(1, custFromService.getCustomerCredentials().getUserName());
		} catch (SQLException e) {
			System.out.println("Setting dynamic values to a query is causing problem");
			e.printStackTrace();
		}

		if(result == 1){
	    	return true;
	    }
	    else
	    	return true;
		
		
		
	}
	
	public List<Customer> getAllCustomers(){
		
		List<Customer> customerList =new ArrayList<Customer>();
		
		JdbcUtilities util = new JdbcUtilities();
		

		Connection connection = util.createMySqlConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		Statement st = null;
		try {
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResultSet rs = st.executeQuery("Select * from customer_login");
			
			
			
			while(rs.next()){
				
				Customer customer = new Customer();
				Address customerAddress = new Address();
				customer.setfName(rs.getString(1));
				customer.setlName(rs.getString(2));
				
				customerAddress.setStreet(rs.getString(5));
				customerAddress.setCity(rs.getString(6));
				customerAddress.setState(rs.getString(7));
				customerAddress.setZip(rs.getString(8));
				
				customer.setCustomerAddress(customerAddress);
				
				customerList.add(customer);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return customerList;
		
	}

}
