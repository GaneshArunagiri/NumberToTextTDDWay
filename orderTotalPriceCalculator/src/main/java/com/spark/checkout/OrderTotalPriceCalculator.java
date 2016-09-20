package com.spark.checkout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static com.spark.checkout.OrderCalculaterInstance.CALCULATOR;
import com.spark.checkout.vo.Item;

public class OrderTotalPriceCalculator {

	public int calculateOrderTotal(String products) {
		int totalPrice = 0;
		List<Item> itemList = getProductList(products);
		totalPrice = CALCULATOR.calculatePrice(itemList);

		return totalPrice;
	}

	private List<Item> getProductList(String products) {
		List<String> productsList = Arrays.asList(products.split(""));
		Set<String> uniqueProducts = new HashSet<String>(productsList);

		List<Item> itemList = new ArrayList<Item>();
		int quantity = 0;
		for (String product : uniqueProducts) {
			quantity = Collections.frequency(productsList, product);
			itemList.add(new Item(product, quantity));
			quantity = 0;
		}

		return itemList;
	}

}
