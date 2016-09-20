package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTotalPriceCalculatorTest {

	@Test
	public void testEmptyOrder() {
		OrderTotalPriceCalculator calculator= new OrderTotalPriceCalculator();
		assertEquals(0, calculator.calculateOrderTotal(""));
	}

}
