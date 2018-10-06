package com.techelevator;


public class KataFizzBuzz {

	private static final int bottomOfRange = 1;
	private static final int topOfRange = 100;
	private static final int fizzNumber = 3;
	private static final int buzzNumber = 5;
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
public String getFizzBuzz(int number) {
	
	
	if(number < bottomOfRange || number > topOfRange) {
		return "";
	}
	String fizzBuzz = "";
	
   if(isDivisibleBy(number, fizzNumber) || containsDigit(number, fizzNumber) ) {   	
    	fizzBuzz += FIZZ;
    }
    	
    
    if(isDivisibleBy(number, buzzNumber) ||  containsDigit(number, buzzNumber)) {
    	fizzBuzz += BUZZ;
    }
    
      if(fizzBuzz.length() == 0) {
        	fizzBuzz = String.valueOf(number);
        }
    
	return fizzBuzz;
}
	
private boolean isDivisibleBy(int number, int multiple) {
	return number % multiple == 0;
}
private boolean containsDigit(int number, int digit) {
	return String.valueOf(number).contains(String.valueOf(digit));
}
}
