package com.bootcamp.corejava.onlineshopping;



/**
 * @author Jagan Reddy
 * Card has a functionality to create a credit card
 */
public class CreditCardHandler {
	
	String myname;
	int balance ;
	
    /*
     * Method to create a credit card by setting the values
     * to instance of a CreditCard Entity Class 
     * and assigns the values of a card to instance variables
     */
    void createCreditCard(){
    	
    	CreditCard myCard = new CreditCard();
    	myCard.setNameOnCard("Jagan Reddy Baddam");
    	myCard.setCreditCardNumber(571216685);
    	myCard.setBalance(15000);
    	myCard.setCvv(175); 
    	
    	myname = myCard.getNameOnCard();
		balance = myCard.getBalance();
    }

	

}
