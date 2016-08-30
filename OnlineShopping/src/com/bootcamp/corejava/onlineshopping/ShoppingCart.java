package com.bootcamp.corejava.onlineshopping;


/**
 * @author Jagan Reddy Shopping cart class
 */
public class ShoppingCart {

	ItemsStrore st = new ItemsStrore();
	int TotalAmount;

	/*
	 * adds the items into cart and displays the items in cart
	 */
	void displayItemsInCart() {

		st.addToCart();

		for (int i = 0; i < st.cartItems.length; i++) {
			System.out.println(st.cartItems[i].toString());
		}
	}

	/*
	 * calculate the total price of items in the cart
	 */
	void calculateTotalPrice() {

		for (int i = 0; i < st.cartItems.length; i++) {
			TotalAmount += st.cartItems[i].getPrice();
		}

		System.out.println("Total Amount in Cart " + TotalAmount);
		System.out.println("======================================");
	}

}
