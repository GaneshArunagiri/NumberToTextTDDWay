package com.spark.checkout;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static com.spark.checkout.OrderCalculaterInstance.CALCULATOR;

public class OrderTotalPrice {

	public int calculatePrice(String products) {
		int totalPrice = 0;
		Map<String, Integer> productMap = getProductMap(products);
		totalPrice = CALCULATOR.calculatePrice(productMap);
		return totalPrice;
	}

	private Map<String, Integer> getProductMap(String products) {
		Map<String, Integer> productMap = new HashMap<String, Integer>();
		List<String> productList = Arrays.asList(products.split(""));
		Set<String> uniqueProducts = new HashSet<String>(productList);

		int quanity = 0;
		for (String product : uniqueProducts) {
			quanity = Collections.frequency(productList, product);
			productMap.put(product, quanity);
			quanity = 0;
		}
		return productMap;
	}
}
