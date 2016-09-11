package com.spark;

public class NumberToTextConverter {

	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen", " twenty" };
	private static final String[] tensNames = { "", " ten", " twenty" };

	public String convertNumbertToText(int inputNumber) {
		String result = "";
		if (inputNumber <= 20) {
			result = numberNames[inputNumber];
		} else {
			inputNumber = inputNumber / 10;
			result = tensNames[inputNumber] + " one";
		}
		return result.trim();
	}

}
