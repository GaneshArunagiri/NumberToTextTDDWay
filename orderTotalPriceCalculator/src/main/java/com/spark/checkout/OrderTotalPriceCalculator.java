package com.spark.checkout;

public class OrderTotalPriceCalculator {

	public int calculateOrderTotal(String products) {
		int totalPrice=0;
		
		if(products.equals("A")) totalPrice=50;
		else if(products.equals("B")) totalPrice=30;
		return totalPrice;
	}

}
