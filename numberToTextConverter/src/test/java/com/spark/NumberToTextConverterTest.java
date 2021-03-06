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
	
	@Test
	public void testNumberTwentyToText() {
		assertEquals("twenty", converter.convertNumbertToText(20));
	}

	@Test
	public void testNumberTwentyOneToText() {
		assertEquals("twenty one", converter.convertNumbertToText(21));
	}
	
	@Test
	public void testNumberThirtyOneToText() {
		assertEquals("thirty one", converter.convertNumbertToText(31));
	}
	
	@Test
	public void testNumberHundredToText() {
		assertEquals("one hundred", converter.convertNumbertToText(100));
	}
	
	@Test
	public void testNumberHundredOneToText() {
		assertEquals("one hundred one", converter.convertNumbertToText(101));
	}
	
	@Test
	public void testNumberNineNinetyNineToText() {
		assertEquals("nine hundred ninety nine", converter.convertNumbertToText(999));
	}
	
	@Test
	public void testNumberThousandToText() {
		assertEquals("one thousand", converter.convertNumbertToText(1000));
	}
	
	@Test
	public void testNumberThousandOneToText() {
		assertEquals("one thousand one", converter.convertNumbertToText(1001));
	}
	
	@Test
	public void testFourDigitNumberToText() {
		assertEquals("two thousand five hundred twenty three", converter.convertNumbertToText(2523));
	}
	
	@After
	public void cleanUp() {
		converter = null;
	}

}
