package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTotalPriceCalculatorTest {

	private OrderTotalPriceCalculator calculator;
	@Before
	public void setup()
	{
		 calculator= new OrderTotalPriceCalculator();
	}
	@Test
	public void testEmptyOrder() {
		assertEquals(0, calculator.calculateOrderTotal(""));
	}
	@Test
	public void testSingleItemA() {
		
		assertEquals(50, calculator.calculateOrderTotal("A"));
	}
	@Test
	public void testSingleItemB() {
		assertEquals(30, calculator.calculateOrderTotal("B"));
	}
	@Test
	public void testTwoItemsOfA() {
		assertEquals(100, calculator.calculateOrderTotal("AA"));
	}

	@After
	public void cleanup()
	{
		calculator=null;
	}
}
