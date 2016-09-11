package com.spark;

public class NumberToTextConverter {

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
		} else if(inputNumber < NUMBER_HUNDRED)
		{
			int tenthDigit = inputNumber / NUMBER_TEN;
			int numberDigit = inputNumber % NUMBER_TEN;
			result = tensNames[tenthDigit] + numberNames[numberDigit];
		}
		else
		{
			int hundredthDigit=inputNumber/NUMBER_HUNDRED;
			inputNumber=inputNumber%NUMBER_HUNDRED;
			int tenthDigit = inputNumber / NUMBER_TEN;
			int numberDigit = inputNumber % NUMBER_TEN;
			result=numberNames[hundredthDigit]+TEXT_HUNDRED +tensNames[tenthDigit] + numberNames[numberDigit];;
		}
		return result.trim();
	}

}
