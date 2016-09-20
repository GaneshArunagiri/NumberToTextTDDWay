package com.spark.checkout;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderTotalPriceCalculator {

	public int calculateOrderTotal(String products) {
		int totalPrice = 0;
		Map<String, Integer> productQTYMap = getProductQtyMap(products);

		String product;
		int qty = 0;
		for (Map.Entry<String, Integer> entry : productQTYMap.entrySet()) {
			product = entry.getKey();
			qty = entry.getValue();
			if (product.equals("A"))
				totalPrice += 50 * qty;
			else if (product.equals("B"))
				totalPrice += 30 * qty;
			else if (product.equals("C"))
				totalPrice += 20 * qty;
			else if (product.equals("D"))
				totalPrice += 15 * qty;
		}
		return totalPrice;
	}

	private Map<String, Integer> getProductQtyMap(String products) {
		Map<String, Integer> productQTYMap = new HashMap<String, Integer>();
		List<String> productList = Arrays.asList(products.split(""));
		Set<String> uniqueProducts = new HashSet<String>(productList);
		int quantity = 0;
		for (String product : uniqueProducts) {
			quantity = Collections.frequency(productList, product);
			productQTYMap.put(product, quantity);
			quantity = 0;
		}

		return productQTYMap;
	}

}
