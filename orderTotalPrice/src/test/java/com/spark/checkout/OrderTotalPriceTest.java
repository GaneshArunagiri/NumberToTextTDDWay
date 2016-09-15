package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTotalPriceTest {

	private OrderTotalPrice ordTotal;

	@Before
	public void setup() {
		ordTotal = new OrderTotalPrice();
	}

	@Test
	public void testEmptyOrder() {

		assertEquals(0, ordTotal.calculatePrice(""));
	}

	@Test
	public void testSingleItemA() {

		assertEquals(50, ordTotal.calculatePrice("A"));
	}

	@Test
	public void testSingleItemB() {

		assertEquals(30, ordTotal.calculatePrice("B"));
	}
	
	@After
	public void cleanup()
	{
		ordTotal=null;
	}
}
