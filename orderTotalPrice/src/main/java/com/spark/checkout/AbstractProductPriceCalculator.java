package com.spark.checkout;

import java.util.Map;

public abstract class AbstractProductPriceCalculator implements ProductPriceCalculator {

	@Override
	public int calculatePrice(Map<String, Integer> productmap) {
		int totalPrice = calculateProductPrice(productmap);
		totalPrice += remainingCalculation(productmap);
		return totalPrice;

	}

	protected abstract ProductPriceCalculator nextCalculator();

	protected int remainingCalculation(Map<String, Integer> productmap) {

		return (nextCalculator() != null) ? nextCalculator().calculatePrice(productmap) : 0;
	}

	protected abstract int calculateProductPrice(Map<String, Integer> productmap);

}
