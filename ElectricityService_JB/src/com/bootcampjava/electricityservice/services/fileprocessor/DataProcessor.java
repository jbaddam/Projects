package com.bootcampjava.electricityservice.services.fileprocessor;


import com.bootcampjava.electricityservice.daos.fileprocessor.FileProcessorDAO;
import com.bootcampjava.electricityservice.models.fileprocessor.Customer;

/**
 * @author Jagan Reddy
 * DataProcessor thread to store the data in database
 */
public class DataProcessor implements Runnable{
		
	Customer customer;
	
	FileProcessorDAO custDao = new FileProcessorDAO();
	
	public DataProcessor(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void run() {	
		
		    //calling FileProcessorDAO class's method to store the data in database
			custDao.storeCustomerInfo(customer);				
	}	
	
}
