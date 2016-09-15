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
	@Test
	public void testSingleItemC() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(20, ordTotal.calculatePrice("C"));
	}
	@Test
	public void testSingleItemD() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(15, ordTotal.calculatePrice("D"));
	}
	
	
	
	
	@After
	public void cleanup()
	{
		ordTotal=null;
	}
}
