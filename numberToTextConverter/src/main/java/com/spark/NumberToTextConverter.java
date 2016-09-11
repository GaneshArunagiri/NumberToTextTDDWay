package com.spark;

public class NumberToTextConverter {

	private static final String TEXT_THOUSAND = " thousand";
	private static final int NUMBER_THOUSAND = 1000;
	private static final String TEXT_HUNDRED = " hundred";
	private static final int NUMBER_HUNDRED = 100;
	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };
	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };
	private static final int NUMBER_TEN = 10;
	private static final int NUMBER_TWENTY = 20;

	public String convertNumbertToText(int inputNumber) {
		String result = "";
		if (inputNumber < NUMBER_TWENTY) {
			result = numberNames[inputNumber];
		} else if (inputNumber < NUMBER_HUNDRED) {
			result = convertLessThanHundred(inputNumber);
		} else if (inputNumber < NUMBER_THOUSAND) {
			result = convertLessThanThousand(inputNumber);
		} else {
			int thousandthDigit = inputNumber / NUMBER_THOUSAND;
			inputNumber = inputNumber % NUMBER_THOUSAND;
			result = numberNames[thousandthDigit] + TEXT_THOUSAND + convertLessThanThousand(inputNumber);

		}
		return result.trim();
	}

	public String convertLessThanThousand(int inputNumber) {
		String result;
		int hundredthDigit = inputNumber / NUMBER_HUNDRED;
		inputNumber = inputNumber % NUMBER_HUNDRED;
		result = numberNames[hundredthDigit];
		if (hundredthDigit > 0) {
			result = result + TEXT_HUNDRED;
		}
		result = result + convertLessThanHundred(inputNumber);
		return result;
	}

	public String convertLessThanHundred(int inputNumber) {
		String result;
		int tenthDigit = inputNumber / NUMBER_TEN;
		int numberDigit = inputNumber % NUMBER_TEN;
		result = tensNames[tenthDigit] + numberNames[numberDigit];
		return result;
	}

}
