package com.techelevator.calculator;

public class Calculator {

	private int currentValue;
	
	public Calculator() {
		
		this.currentValue = 0;
	}
	
	

	
	public int getCurrentValue() {
		return this.currentValue;
	}




	public int add(int addend) {
		
		this.currentValue = currentValue + addend;
		return currentValue ;
	}

	public int multiply(int multiplier) {
		this.currentValue = this.currentValue * multiplier;
		return this.currentValue ;
	}
	
	public int subtract(int subtrahend) {
		
		this.currentValue -= subtrahend;
		return this.currentValue;
	}
	
	public int power(int exponent) {
		
		this.currentValue = (int) Math.pow(currentValue, exponent);
		return this.currentValue;
	}
	
	public void reset() {
		
		this.currentValue = 0;
	}
}
