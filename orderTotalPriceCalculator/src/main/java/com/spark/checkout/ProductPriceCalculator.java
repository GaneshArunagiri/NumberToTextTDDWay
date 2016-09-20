package com.spark.checkout;

import java.util.List;

import com.spark.checkout.vo.Item;

public interface ProductPriceCalculator {

	int calculatePrice(List<Item> productList);

}
