package com.spark;

public class NumberToTextConverter {

	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public String convertNumbertToText(int inputNumber) {
		String result = "";
		result = numberNames[inputNumber];
		return result.trim();
	}

}
