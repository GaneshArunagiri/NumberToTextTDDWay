package com.spark.checkout;

import java.util.List;

import com.spark.checkout.vo.Item;

public class ProductPriceWithoutPromo extends AbstractProductPriceCalculator {

	@Override
	protected int calculateProductPrice(List<Item> productList) {
		int qty = 0;
		int price = 0;
		int totalPrice = 0;
		for (Item item : productList) {
			price = item.getPrice();
			qty = item.getItemQty();
			if (item.getPromoQty() == 0) {

				totalPrice += price * qty;
			}

		}
		return totalPrice;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return null;
	}

}
