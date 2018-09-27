package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public ShoppingCart() {
		
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0;
		
	}

	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		if(this.totalAmountOwed == 0.0 && this.totalNumberOfItems == 0) {
			return 0.0;
		}
		double averagePricePerItem = (this.totalAmountOwed / this.totalNumberOfItems);
		return averagePricePerItem;
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		
		this.totalNumberOfItems += numberOfItems;
		this.totalAmountOwed += (pricePerItem * numberOfItems);
	}
	
	public void empty() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0;
	}
}
