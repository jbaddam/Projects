package com.bootcamp.webapplication.creditcardactivation.services;



import com.bootcamp.webapplication.creditcardactivation.daos.CreditCardActivationDAO;
import com.bootcamp.webapplication.creditcardactivation.entities.Customer;

public class CreditCardActivationService {
	
	public Customer cs;
	
	CreditCardActivationDAO ccDAO ;
		
	
	public void setCcDAO(CreditCardActivationDAO ccDAO) {
		this.ccDAO = ccDAO;
	}


	public boolean validateCreditCard(Customer c){
		
				
		  cs = ccDAO.getCreditCardInformation(c);
		 try{
		 if(cs.getCard().getCreditCardNumber().equals(c.getCard().getCreditCardNumber())
				 &&cs.getCard().getCvv().equals(c.getCard().getCvv())&&cs.getSsn().equals(c.getSsn())){
			 System.out.println("Credit card activated");
			 return true;				 
		 }
		 else
			 System.out.println("Credit NOT activated");
		return false;
		 }catch(java.lang.NullPointerException e){
			 return false;
		 }
		 	
	}
	

}
