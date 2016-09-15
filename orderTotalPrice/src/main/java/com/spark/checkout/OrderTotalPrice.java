package com.spark.checkout;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderTotalPrice {

	public int calculatePrice(String products) {
		int totalPrice = 0;

		Map<String, Integer> productMap = getProductMap(products);

		String product;
		int quantity = 0;
		for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
			product = entry.getKey();
			quantity = entry.getValue();
			if (product.equals("A")) {
				if (quantity < 3) {
					totalPrice += 50 * quantity;
				} else {
					totalPrice += (quantity / 3) * 130 + (quantity % 3) * 50;
				}
			} else if (product.equals("B")) {
				if (quantity < 2) {
					totalPrice += 30 * quantity;
				} else {
					totalPrice += (quantity / 2) * 45 + (quantity % 2) * 30;
				}
			} else if (product.equals("C"))
				totalPrice += 20 * quantity;
			else if (product.equals("D"))
				totalPrice += 15 * quantity;
		}
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
