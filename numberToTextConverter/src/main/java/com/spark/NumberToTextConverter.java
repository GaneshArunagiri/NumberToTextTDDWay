package com.spark;

public class NumberToTextConverter {

	private static final int NUMBER_ZERO = 0;
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
			result = convertFourDigitNumber(inputNumber);
		}
		return result.trim();
	}

	public String convertFourDigitNumber(int inputNumber) {
		String result;
		int thousandthDigit = getQuotient(inputNumber, NUMBER_THOUSAND);
		inputNumber = getRemainder(inputNumber, NUMBER_THOUSAND);
		result = numberNames[thousandthDigit] + TEXT_THOUSAND + convertLessThanThousand(inputNumber);
		return result;
	}

	public String convertLessThanThousand(int inputNumber) {
		String result;
		int hundredthDigit = getQuotient(inputNumber, NUMBER_HUNDRED);
		inputNumber = getRemainder(inputNumber, NUMBER_HUNDRED);
		result = numberNames[hundredthDigit];
		if (hundredthDigit > NUMBER_ZERO) {
			result = result + TEXT_HUNDRED;
		}
		result = result + convertLessThanHundred(inputNumber);
		return result;
	}

	public String convertLessThanHundred(int inputNumber) {
		String result;
		int tenthDigit = getQuotient(inputNumber, NUMBER_TEN);
		int numberDigit = getRemainder(inputNumber, NUMBER_TEN);
		result = tensNames[tenthDigit] + numberNames[numberDigit];
		return result;
	}

	public int getRemainder(int inputNumber, int divider) {
		return inputNumber % divider;
	}

	public int getQuotient(int inputNumber, int divider) {
		return inputNumber / divider;
	}

}
