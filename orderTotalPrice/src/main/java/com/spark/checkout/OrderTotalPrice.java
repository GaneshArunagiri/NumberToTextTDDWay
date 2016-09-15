package com.spark.checkout;

public class OrderTotalPrice {

	public int calculatePrice(String products) {
		if(products.equals("A"))
		{
			return 50;
		}
		return 0;
	}

}
