package com.bootcamp.corejava.onlineshopping;



/**
 * @author Jagan Reddy
 * Items Entity class
 */
public class Items {

	private int itemId;
	private String itemName;
	private int price;

	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemId :" + itemId + "\nItemName : " + itemName + "\nPrice : " + price + "\n";
	}

}
