package com.bootcamp.corejava.onlineshopping;



/**
 * @author Jagan Reddy
 * Class has a functionality to create customer
 */
public class CustomerHandler {
	
	Customer customer = new Customer();
	
	
	/*
	 * This method creates and display the customer by setting 
	 * values to instance of entity class
	 */
	void createCustomer(){
		 
		 customer.setName("Baddam Jagan Reddy");
		 customer.setCustomerId(17571757);
		 customer.setAdress("1401 Red Hawk Cir\nApt J206 Fremont\nCA 94538");
		 System.out.println("****************Customer Details****************");
		System.out.println(customer.display());
		System.out.println("************************************************");
	}

}
