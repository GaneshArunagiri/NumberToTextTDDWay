package com.spark.checkout;

import java.util.List;

import com.spark.checkout.vo.Item;

public class ProductPriceWithPromo extends AbstractProductPriceCalculator {
	public static final ProductPriceCalculator NEXT_CALCULATOR = new ProductPriceWithoutPromo();

	@Override
	protected int calculateProductPrice(List<Item> productList) {
		int qty = 0;
		int price = 0;
		int totalPrice = 0;
		for (Item item : productList) {
			price = item.getPrice();
			qty = item.getItemQty();
			if (item.getPromoQty() > 0) {

				totalPrice += (qty / item.getPromoQty()) * item.getPromoPrice() + (qty % item.getPromoQty()) * price;
			}

		}
		return totalPrice;
	}

	@Override
	protected ProductPriceCalculator nextCalculator() {
		return NEXT_CALCULATOR;
	}

}
