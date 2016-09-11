package com.spark;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberToTextConverterTest {

	private NumberToTextConverter converter;

	@Before
	public void setup() {
		converter = new NumberToTextConverter();
	}

	@Test
	public void testNumberOneToText() {
		assertEquals("one", converter.convertNumbertToText(1));
	}

	@Test
	public void testNumberTwoToText() {
		assertEquals("two", converter.convertNumbertToText(2));
	}

	@Test
	public void testNumberThreeToText() {
		assertEquals("three", converter.convertNumbertToText(3));
	}

	@After
	public void cleanUp() {
		converter = null;
	}

}
