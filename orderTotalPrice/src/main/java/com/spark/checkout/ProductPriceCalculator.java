package com.spark.checkout;

import java.util.Map;

public interface ProductPriceCalculator {

	int calculatePrice(Map<String, Integer> productmap);

}
