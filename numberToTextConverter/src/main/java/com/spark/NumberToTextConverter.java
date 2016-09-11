package com.spark;

public class NumberToTextConverter {

	public String convertNumbertToText(int inputNumber) {
		String result = "";
		if (inputNumber == 1) {
			result = "one";
		} else {
			result = "two";
		}
		return result;
	}

}
