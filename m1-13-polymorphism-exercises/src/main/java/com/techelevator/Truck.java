package com.techelevator;

public class Truck implements Vehicle{

	private int numberOfAxles;

	public Truck(int numberOfAxles) {
		
		this.numberOfAxles = numberOfAxles;
	}
    
	@Override
	public double CalculateToll(int distance) {
		double toll = 0.0;
		if(this.numberOfAxles == 4) {
			
			toll = 0.040 * distance;
		    return toll;
		}
		else if(this.numberOfAxles == 6) {
			
			toll = 0.045 * distance;
			return toll;
		}
		else if(this.numberOfAxles >= 8) 
			
			toll = 0.048 * distance;
		    return toll;
	
	}
	@Override
 public String toString() {
		return null; 
	}
}
