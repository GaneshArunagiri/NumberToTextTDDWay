package com.spark.checkout;

public class OrderTotalPrice {

	public int calculatePrice(String products) {
		int totalPrice=0;
		if(products.equals("A"))
		{
			totalPrice= 50;
		}
		return totalPrice;
	}

}
