package com.spark.checkout;

import java.util.Map;

public class ProductPriceWithoutPromo extends AbstractProductPriceCalculator {

	@Override
	protected int calculateProductPrice(Map<String, Integer> productMap) {
		
		System.out.println("without Promo");
		return 0;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return null;
	}

}
