package com.techelevator;

public class FexEd implements DeliveryDriver{

	@Override
	public double CalculateRate(int distance, double weight) {
		
		double rate = 20.00;
		
		if(distance > 500) {
			
			return rate + 5.00;
		}
		
		if(weight > 48) {
			
			return rate + 3.00;
		}
		return rate;
	}

	
}
