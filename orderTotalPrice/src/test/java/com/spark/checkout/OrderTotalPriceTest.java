package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTotalPriceTest {

	@Test
	public void testEmptyOrder() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(0, ordTotal.calculatePrice(""));
	}
 
	@Test
	public void testSingleItemA() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(50, ordTotal.calculatePrice("A"));
	}
	
	@Test
	public void testSingleItemB() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(30, ordTotal.calculatePrice("B"));
	}
}
