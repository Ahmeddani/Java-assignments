package com.techelevator.postage;

public class PostalService implements DeliveryDriver{

	private int deliveryClass;
	
	public PostalService(int deliveryClass) {
		
		this.deliveryClass = deliveryClass;
	}
	@Override
	public double CalculateRate(int distance, double weight) {
	
		double rate = 0.00;
		switch (this.deliveryClass) {
		
		case 1:
			if (weight >= 0 && weight <= 2) {
				rate  = 0.035 * distance;
				
			}
			if (weight >= 3 && weight <= 8) {
				rate = 0.040 * distance;
				
			}
			if (weight >= 9 && weight <=15) {
				
				rate = 0.047 * distance;
				
			}
			if(weight >= 16 && weight <= 48) {
				rate = 0.195 * distance;
				
			}
			if(weight >= 49 && weight <= 128) {
				rate = 0.450 * distance;
				
			}
			if(weight >= 129) {
				rate = 0.500 * distance;
				
			}
			return rate;
			
		case 2:
			if (weight >= 0 && weight <= 2) {
				rate  = 0.0035 * distance;
				
			}
			if (weight >= 3 && weight <= 8) {
				rate = 0.0040 * distance;
				
			}
			if (weight >= 9 && weight <=15) {
				rate = 0.0047 * distance;
				
			}
			if(weight >= 16 && weight <= 48) {
				rate = 0.0195 * distance;
				
			}
			if(weight >= 49 && weight <= 128) {
				rate = 0.0450 * distance;
				
			}
			if(weight >= 129) {
				rate = 0.0500 * distance;
				
			}
			return rate;
			
		case 3:
			if (weight >= 0 && weight <= 2) {
				rate  = 0.0020 * distance;
				
			}
			if (weight >= 3 && weight <= 8) {
				rate = 0.0022 * distance;
				
			}
			if (weight >= 9 && weight <=15) {
				rate = 0.0024 * distance;
				
			}
			if(weight >= 16 && weight <= 48) {
				rate = 0.0150 * distance;
				
			}
			if(weight >= 49 && weight <= 128) {
				rate = 0.0160 * distance;
				
			}
			if(weight >= 129) {
				rate = 0.0170 * distance;
				
			}
		
	}
       return rate;
	}
	
	@Override
	public String toString() {
		return "Postal Service "+ deliveryClass + " - Class";
	}
}
