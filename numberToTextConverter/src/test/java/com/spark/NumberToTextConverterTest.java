package com.spark;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToTextConverterTest {

	@Test
	public void testNumberOneToText() {
		NumberToTextConverter converter=new NumberToTextConverter();
		assertEquals("one",converter.convertNumbertToText(1));
	}

}
