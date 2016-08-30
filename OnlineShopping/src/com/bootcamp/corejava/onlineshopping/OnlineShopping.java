package com.bootcamp.corejava.onlineshopping;



import java.util.Random;

/**
 * @author Jagan Reddy
 * This class facilitates to do shopping
 */
public class OnlineShopping {

	CustomerHandler ch= new CustomerHandler();
	ItemsStrore store = new ItemsStrore();
	CreditCardHandler card = new CreditCardHandler();
	ShoppingCart scart = new ShoppingCart();

	
   /*
    * verifies the payment
    */
	void verifyPayment() {
		
		card.createCreditCard();
		scart.calculateTotalPrice();
		System.out.println("- - - - - - -  Payment Status - - - - - - - - ");
		
		if (card.balance < scart.TotalAmount) {
			System.out.println("InSufficient Funds !");
		} else {
			card.balance = card.balance - scart.TotalAmount;
			System.out.println(
					"\nPayment verified successfully\n");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
			
			generateOrderNumber();
			System.out.println("\nYour order will be shipped to below Address\n\n" +ch.customer.getAdress());
			System.out.println("-------------Your order Datails-------------");
			scart.displayItemsInCart();
			System.out.println("--------------------------------------------");
		}

	}

	/*
	 * generates order details
	 */
	void generateOrderNumber() {
		Random rand = new Random();
		System.out.println("\nplease wait your order is generating.!.!.!.!.!.!........\n");
		int n = rand.nextInt(1234566833);
		String str = "AMZ" + Integer.toString(n);
		System.out.println("Your Order Number is " + str);
	}


	 /*
	  * allows to do shopping in a order
	  */
     void Shopping() {
		
		ch.createCustomer();	
		System.out.println("-----------Item in my cart------------");
		scart.displayItemsInCart();
		System.out.println("--------------------------------------");
		verifyPayment();
		
	}

	
	public static void main(String[] args) {
		OnlineShopping shopping = new OnlineShopping();
		shopping.Shopping();
	}

}
