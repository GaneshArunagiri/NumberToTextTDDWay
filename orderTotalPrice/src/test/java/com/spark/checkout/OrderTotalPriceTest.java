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

		assertEquals(20, ordTotal.calculatePrice("C"));
	}

	@Test
	public void testSingleItemD() {

		assertEquals(15, ordTotal.calculatePrice("D"));
	}

	@Test
	public void testTwoItemsOfA() {
		assertEquals(100, ordTotal.calculatePrice("AA"));
	}

	@Test
	public void testSingleItemABCD() {
		assertEquals(115, ordTotal.calculatePrice("ABCD"));
	}

	@Test
	public void testDiscountOfA() {
		assertEquals(130, ordTotal.calculatePrice("AAA"));
	}

	@Test
	public void testDiscountOfB() {
		assertEquals(45, ordTotal.calculatePrice("BB"));
	}

	@Test
	public void testDiscountOfAB() {
		assertEquals(190, ordTotal.calculatePrice("AAABBD"));
	}

	@Test
	public void testCombinations() {
		assertEquals(100, ordTotal.calculatePrice("AA"));
		assertEquals(130, ordTotal.calculatePrice("AAA"));
		assertEquals(180, ordTotal.calculatePrice("AAAA"));
		assertEquals(230, ordTotal.calculatePrice("AAAAA"));
		assertEquals(260, ordTotal.calculatePrice("AAAAAA"));

		assertEquals(160, ordTotal.calculatePrice("AAAB"));
		assertEquals(175, ordTotal.calculatePrice("AAABB"));
		assertEquals(190, ordTotal.calculatePrice("AAABBD"));
		assertEquals(190, ordTotal.calculatePrice("DABABA"));

	}

	@After
	public void cleanup() {
		ordTotal = null;
	}
}
