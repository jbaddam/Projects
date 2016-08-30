package com.bootcamp.corejava.onlineshopping;



/**
 * @author Jagan Reddy
 * Class has a list of products 
 */
public class ItemsStrore {

	
	Items[] cartItems = new Items[2];
	

	/*
	 * @return iphone object
	 * it has all the details
	 */
	Items iphone(){
		Items iphone = new Items();
		iphone.setItemId(111);
		iphone.setItemName("I Phone 6S Plus");
		iphone.setPrice(749);	
		
		return iphone;
	}

	/*
	 * @return samsung object
	 * it has all the details
	 */
	Items samsung(){
		Items samsung = new Items();
		samsung.setItemId(222);
		samsung.setItemName("Sansung Galaxy Edge");
		samsung.setPrice(649);	
		
		return samsung; 
	}

	/*
	 * adding items to cart
	 */
	public void addToCart() {
		cartItems[0] = samsung();
		cartItems[1] = iphone();
		
	}
	

}
