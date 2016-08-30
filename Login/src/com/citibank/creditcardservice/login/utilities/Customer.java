package com.citibank.creditcardservice.login.utilities;

public class Customer {
	
	private String fName;
	private String lName;
	private CustomerCredentials customerCredentials;
	private Address customerAddress;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public CustomerCredentials getCustomerCredentials() {
		return customerCredentials;
	}
	public void setCustomerCredentials(CustomerCredentials customerCredentials) {
		this.customerCredentials = customerCredentials;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	

}
