package com.spark;

public class NumberToTextConverter {

	private static final String[] numberNames={"","one","two","three"};
	public String convertNumbertToText(int inputNumber) {
		String result = "";
		result=numberNames[inputNumber];
		return result;
	}

}
