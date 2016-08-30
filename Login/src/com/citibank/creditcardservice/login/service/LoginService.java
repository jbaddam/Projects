package com.citibank.creditcardservice.login.service;

import java.util.ArrayList;
import java.util.List;

import com.citibank.creditcardservice.login.daos.LoginDAO;
import com.citibank.creditcardservice.login.utilities.Customer;

public class LoginService {
	
	public Customer customerFromDao = null;
	
	public boolean validateCredentials(Customer customer){
		
		LoginDAO login = new LoginDAO();
		
		customerFromDao = login.getCustomerInfo(customer);
		
		
		if(customer.getCustomerCredentials().getUserName().equals(customerFromDao.getCustomerCredentials().getUserName()) && 
				customer.getCustomerCredentials().getPassword().equals(customerFromDao.getCustomerCredentials().getPassword())	){
			return true;
		}
		
		return false;		
	}
	
	public boolean registerService(Customer customer){
		LoginDAO registerDao = new LoginDAO();
		if(registerDao.registerCustomer(customer)){
			return true;
		}else{
			return	false;
		}
		
	}
	
	public List<Customer> getAllCustomers(){
		LoginDAO login = new LoginDAO();
		
		List<Customer> customerList = login.getAllCustomers();
		
		return customerList;		
			
	}

}
