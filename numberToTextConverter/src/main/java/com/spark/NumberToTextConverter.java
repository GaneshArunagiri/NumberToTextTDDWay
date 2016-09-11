package com.spark;

public class NumberToTextConverter {

	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };
	private static final String[] tensNames = { "", " ten", " twenty" };
	private static final int NUMBER_TEN = 10;
	private static final int NUMBER_TWENTY = 20;
	
	public String convertNumbertToText(int inputNumber) {
		String result = "";
		if (inputNumber < NUMBER_TWENTY) {
			result = numberNames[inputNumber];
		} else {
			int tenthDigit = inputNumber / NUMBER_TEN;
			int numberDigit = inputNumber % NUMBER_TEN;
			result = tensNames[tenthDigit] + numberNames[numberDigit];
		}
		return result.trim();
	}

}
