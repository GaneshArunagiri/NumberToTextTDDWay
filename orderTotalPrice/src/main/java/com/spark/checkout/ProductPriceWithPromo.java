package com.spark.checkout;

import java.util.Map;

public class ProductPriceWithPromo extends AbstractProductPriceCalculator {
	public static final ProductPriceCalculator NEXT_CALCULATOR=new ProductPriceWithoutPromo();

	@Override
	protected int calculateProductPrice(Map<String, Integer> productmap) {

		String product;
		int qty;
		int totalPrice=0;
		for (Map.Entry<String, Integer> entry : productmap.entrySet()) {
			product = entry.getKey();
			qty=entry.getValue();
			if (product.equals("A")) {
				if (qty < 3) {
					totalPrice += 50 * qty;
				} else {
					totalPrice += (qty / 3) * 130 + (qty % 3) * 50;
				}
			} else if (product.equals("B")) {

				if (qty < 2) {
					totalPrice += 30 * entry.getValue();
				} else {
					totalPrice += (qty / 2) * 45 + (qty % 2) * 30;
				}
			}
		}
		return totalPrice;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return NEXT_CALCULATOR;
	}
	

}
