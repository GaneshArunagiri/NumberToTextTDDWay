package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTotalPriceCalculatorTest {

	@Test
	public void testEmptyOrder() {
		OrderTotalPriceCalculator calculator= new OrderTotalPriceCalculator();
		assertEquals(0, calculator.calculateOrderTotal(""));
	}
	@Test
	public void testSingleItemA() {
		OrderTotalPriceCalculator calculator= new OrderTotalPriceCalculator();
		assertEquals(50, calculator.calculateOrderTotal("A"));
	}
	@Test
	public void testSingleItemB() {
		OrderTotalPriceCalculator calculator= new OrderTotalPriceCalculator();
		assertEquals(30, calculator.calculateOrderTotal("B"));
	}

}
