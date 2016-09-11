package com.spark;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToTextConverterTest {

	@Test
	public void testNumberOneToText() {
		NumberToTextConverter converter=new NumberToTextConverter();
		assertEquals("one",converter.convertNumbertToText(1));
	}
	
	@Test
	public void testNumberTwoToText() {
		NumberToTextConverter converter=new NumberToTextConverter();
		assertEquals("two",converter.convertNumbertToText(2));
	}
	
	@Test
	public void testNumberThreeToText() {
		NumberToTextConverter converter=new NumberToTextConverter();
		assertEquals("three",converter.convertNumbertToText(3));
	}

}
