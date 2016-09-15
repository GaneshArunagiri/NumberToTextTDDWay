package com.spark.checkout;

import java.util.Map;

public class ProductPriceWithoutPromo extends AbstractProductPriceCalculator {

	@Override
	protected int calculateProductPrice(Map<String, Integer> productMap) {
		String product;
		int qty;
		int totalPrice=0;
		
		for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
			product = entry.getKey();
			qty=entry.getValue();
			if (product.equals("C"))
				totalPrice += 20 * qty;
			else if (product.equals("D"))
				totalPrice += 15 * qty;
		}
		return totalPrice;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return null;
	}

}
