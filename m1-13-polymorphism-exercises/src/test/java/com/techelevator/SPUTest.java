package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.postage.SPU;

public class SPUTest {

	SPU spu = new SPU("4");
	
	@Test
	public void check_for_four_day_delivery() {
		double rate = spu.CalculateRate(10, 10);
		Assert.assertEquals(0.50, rate,0);
	}
	
	@Test
	public void check_for_two_day_delivery() {
		spu = new SPU("2");
		double rate = spu.CalculateRate(10, 10);
		Assert.assertEquals(5.0, rate,0);
	}
	
	@Test
	public void check_for_next_day_delivery() {
		spu = new SPU("next day");
		double rate = spu.CalculateRate(10, 10);
		Assert.assertEquals(7.50, rate,0);
	}
}
