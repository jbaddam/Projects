package com.bootcampjava.electricityservice.services.fileprocessor;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.bootcampjava.electricityservice.daos.fileprocessor.FileProcessorDAO;
import com.bootcampjava.electricityservice.models.fileprocessor.Customer;
import com.bootcampjava.electricityservice.utilities.PropertiesUtility;
import com.bootcampjava.electricityservice.models.fileprocessor.Service;

/**
 * @author Jagan Reddy
 * This class has behaviors to Process the text file ,getting all customers info
 * execute threads and delete data from database
 */
public class FileProcessorService  {
	List<Customer> customerList;
	
	/**
	 * @param inputFile
	 * @return
	 * This method will take a file as input, process that file
	 * and it returns true if file processed 
	 */
	public boolean processCustomerInfo(InputStream inputFile) {
		
		customerList = new ArrayList<Customer>();
		Customer customer = null;
		Service service = null;
		String line = null;
		BufferedReader bufferedReader = null;

		try {

			bufferedReader = new BufferedReader(new InputStreamReader(inputFile));

			while ((line = bufferedReader.readLine()) != null) {
				String[] customerInfoArray = line.split("\t");

				customer = new Customer();
				service = new Service();

				customer.setFirstName(customerInfoArray[0]);
				customer.setLastName(customerInfoArray[1]);
				customer.setEmail(customerInfoArray[2]);
				customer.setPhone(customerInfoArray[3]);

				service.setServiceID(customerInfoArray[4]);
				service.setStartDate(new Date(customerInfoArray[5]));
				service.setEndDate(new Date(customerInfoArray[6]));

				customer.setServiceInfo(service);
				
				//adding customer objects to list
				customerList.add(customer);

			}

			bufferedReader.close();
		}  catch (IOException ex) {
			System.out.println("Error reading file '" + inputFile + "'");
		}
	
		//calling the executeThreads method
		boolean status = executeThreads();
		return status;
	}
	
	/**
	 * @return
	 * This method assigns the tasks to different threads in ExecutorService Thread pool
	 * and returns true if all threads executed successfully
	 */
	public boolean executeThreads() {
     
		PropertiesUtility propUtility = new PropertiesUtility();

		Properties properties = propUtility.getProperies();
		int numOfThreads = Integer.parseInt(properties.getProperty("numberofthreads"));
		
		ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);
		Runnable task = null;

		for (Customer customer : customerList) {
			task = new DataProcessor(customer);
			executor.execute(task);
		}

		executor.shutdown();
		
		//waiting for all threads to complete their tasks
		while (!executor.isTerminated()) { }
		
		return executor.isTerminated();
	}
	
	
	/**
	 * @return
	 * this method returns FileProcessorDAO class's getAllCustomers method
	 * i.e list of all customers
	 */
	public List<Customer> getAllCustomers(){
		FileProcessorDAO dao =new FileProcessorDAO();		
		return  dao.getAllCustomers();
	}
	
	
	/**
	 * @return
	 * This method returns  FileProcessorDAO class's dataClean method
	 * i.e true/false
	 */
	public  boolean cleanData(){
		FileProcessorDAO dao = new FileProcessorDAO();
		return dao.dataClean();
	}

}
