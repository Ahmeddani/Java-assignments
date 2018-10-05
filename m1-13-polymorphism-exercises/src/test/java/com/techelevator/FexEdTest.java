package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FexEdTest {

	FexEd fx = new FexEd();
	
	@Test
	public void check_distance_limit() {
		
		double rate = fx.CalculateRate(600, 10);
		Assert.assertEquals(25.0, rate, 0 );
	}
	
	@Test
	public void check_weight_limit() {
		
		double rate = fx.CalculateRate(400, 100);
		Assert.assertEquals(23.0, rate, 0 );
	}
	
	@Test
	public void check_for_correct_rate() {
		
		double rate = fx.CalculateRate(300, 10);
		Assert.assertEquals(20.0, rate, 0 );
	}
}
