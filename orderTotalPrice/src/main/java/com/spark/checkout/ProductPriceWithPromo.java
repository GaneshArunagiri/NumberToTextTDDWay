package com.spark.checkout;

import java.util.Map;

public class ProductPriceWithPromo extends AbstractProductPriceCalculator {
	public static final ProductPriceCalculator NEXT_CALCULATOR=new ProductPriceWithoutPromo();

	@Override
	protected int calculateProductPrice(Map<String, Integer> productmap) {
		
		System.out.println("with Promo");
		return 0;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return NEXT_CALCULATOR;
	}
	

}
