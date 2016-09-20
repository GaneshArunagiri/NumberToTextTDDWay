package com.spark.checkout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.spark.checkout.vo.Item;

public class OrderTotalPriceCalculator {

	public int calculateOrderTotal(String products) {
		int totalPrice = 0;
		List<Item> ItemList=getProductList(products);

		String product;
		int qty = 0;
		int price=0;
		for (Item item:ItemList) {
			product = item.getName();
			price=item.getPrice();
			qty = item.getItemQty();
			if (product.equals("A"))
				totalPrice += price * qty;
			else if (product.equals("B"))
				totalPrice += price * qty;
			else if (product.equals("C"))
				totalPrice += price * qty;
			else if (product.equals("D"))
				totalPrice += price * qty;
		}
		return totalPrice;
	}

	private List<Item> getProductList(String products) {
		List<String> productsList = Arrays.asList(products.split(""));
		Set<String> uniqueProducts = new HashSet<String>(productsList);
		
		List<Item> itemList=new ArrayList<Item>();
		int quantity = 0;
		for (String product : uniqueProducts) {
			quantity = Collections.frequency(productsList, product);
			itemList.add(new Item(product, quantity));
			quantity = 0;
		}

		return itemList;
	}

}
