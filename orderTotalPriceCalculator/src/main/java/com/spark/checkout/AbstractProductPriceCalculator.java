package com.spark.checkout;

import java.util.List;

import com.spark.checkout.vo.Item;

public abstract class AbstractProductPriceCalculator implements ProductPriceCalculator {

	@Override
	public int calculatePrice(List<Item> productList) {
		int totalPrice = calculateProductPrice(productList);
		totalPrice += remainingCalculation(productList);
		return totalPrice;
	}

	protected abstract ProductPriceCalculator nextCalculator();

	protected int remainingCalculation(List<Item> productList) {

		return (nextCalculator() != null) ? nextCalculator().calculatePrice(productList) : 0;
	}

	protected abstract int calculateProductPrice(List<Item> productList);

}
