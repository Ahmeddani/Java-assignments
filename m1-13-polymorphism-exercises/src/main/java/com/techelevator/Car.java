package com.techelevator;

import java.util.Random;

public class Car implements Vehicle{
	
	private boolean hasTrailer;
    
	public Car(boolean hasTrailer) {
		
		this.hasTrailer = hasTrailer;
	}

	@Override
    public double CalculateToll(int distance) {
	
		double toll = distance * 0.020;
		if(hasTrailer) {
			
			return toll + 1.00;
		}
		
		return toll;
	}
	
	
}
