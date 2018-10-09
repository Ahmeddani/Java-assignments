package com.techelevator;

public class FizzBuzz {

	private static final int BOTTOM_OF_RANGE = 1;
	private static final int TOP_OF_RANGE = 300;
	
	private static final int FIZZ_NUMBER = 3;
	private static final int BUZZ_NUMBER = 5;
	
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
	public String getFizzBuzz(int number) {
		
		// Check if outside of range, and return empty string
		if (number < BOTTOM_OF_RANGE || number > TOP_OF_RANGE) {
			return "";
		}
		
		String fizzBuzz = "";
				
		// If Divisible by 3 or contains 3 add Fizz to the return
		if (isDivisbleBy(number, FIZZ_NUMBER) || containsDigit(number, FIZZ_NUMBER)) {
			fizzBuzz += FIZZ;
		}
		
		// If Divisible by 5 or contains 5 add Buzz to the return
		if (isDivisbleBy(number, BUZZ_NUMBER) || containsDigit(number, BUZZ_NUMBER)) {
			fizzBuzz += BUZZ;
		}
		
		// If the string is still empty put the original number in it, this will return numbers that
		// meet none of the conditions
		if (fizzBuzz.length() == 0) {
			fizzBuzz = String.valueOf(number);
		}
		
		return fizzBuzz;
	}
	
	/*
	 * Private methods with descriptive names can be used for repeatable code and to make
	 * complex code more readable
	 */
	private boolean isDivisbleBy(int number, int multiple) {
		return number % multiple == 0;
	}
	
	private boolean containsDigit(int number, int digit) {
		return String.valueOf(number).contains(String.valueOf(digit));
	}
	
}
