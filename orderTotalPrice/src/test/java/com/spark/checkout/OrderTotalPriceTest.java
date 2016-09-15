package com.spark.checkout;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTotalPriceTest {

	@Test
	public void testEmptyOrder() {
		OrderTotalPrice ordTotal=new OrderTotalPrice();
		assertEquals(0, ordTotal.calculatePrice(""));
	}

}
