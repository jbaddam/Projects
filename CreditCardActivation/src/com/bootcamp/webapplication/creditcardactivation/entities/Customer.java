package com.bootcamp.webapplication.creditcardactivation.entities;

public class Customer {
	
	private String fname;
	private String lname;
	private String ssn;
	
	private  CreditCard card;
	
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public CreditCard getCard() {
		return card;
	}
	
	public void setCard(CreditCard card) {
		this.card = card;
	}
	
}
