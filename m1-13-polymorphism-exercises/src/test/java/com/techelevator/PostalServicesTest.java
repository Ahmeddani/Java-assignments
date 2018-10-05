package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class PostalServicesTest {

	PostalService ps = new PostalService(1);

	@Test
	public void calculate_correct_rate_first_class() {
		double result = ps.CalculateRate(10, 50);
		Assert.assertEquals(4.50, result, 1);
	}
	
	@Test
	public void calculate_correct_rate_second_class() {
		ps = new PostalService(2);
		double result = ps.CalculateRate(10, 50);
		Assert.assertEquals(0.45, result, 1);
	}
	
	@Test
	public void calculate_correct_rate_third_class() {
		ps = new PostalService(3);
		double result = ps.CalculateRate(10, 50);
		Assert.assertEquals(0.16, result, 1);
	}
	
	@Test
	public void check_for_weight_ranges_first_Class() {
		ps = new PostalService(1);
		double result = ps.CalculateRate(10, 1);
		Assert.assertEquals(0.35, result, 1);
		double result2 = ps.CalculateRate(10, 5);
		Assert.assertEquals(0.04, result2, 1);
		double result3 = ps.CalculateRate(10, 150);
		Assert.assertEquals(5.0, result3, 1);
		double result4 = ps.CalculateRate(10, 10);
		Assert.assertEquals(0.47, result4, 1);
		double result5 = ps.CalculateRate(10, 30);
		Assert.assertEquals(1.95, result5, 1);
	}
	@Test
	public void check_for_weight_ranges_second_Class() {
		ps = new PostalService(2);
		double result = ps.CalculateRate(10, 1);
		Assert.assertEquals(0.035, result, 1);
		double result2 = ps.CalculateRate(10, 5);
		Assert.assertEquals(0.004, result2, 1);
		double result3 = ps.CalculateRate(10, 150);
		Assert.assertEquals(0.5, result3, 1);
		double result4 = ps.CalculateRate(10, 10);
		Assert.assertEquals(0.047, result4, 1);
		double result5 = ps.CalculateRate(10, 30);
		Assert.assertEquals(0.195, result5, 1);
	}
	
	@Test
	public void check_for_weight_ranges_third_Class() {
		ps = new PostalService(3);
		double result = ps.CalculateRate(10, 1);
		Assert.assertEquals(0.020, result, 1);
		double result2 = ps.CalculateRate(10, 5);
		Assert.assertEquals(0.022, result2, 1);
		double result3 = ps.CalculateRate(10, 150);
		Assert.assertEquals(0.170, result3, 1);
		double result4 = ps.CalculateRate(10, 10);
		Assert.assertEquals(0.15, result3, 1);
		double result5 = ps.CalculateRate(10, 30);
		Assert.assertEquals(0.150, result5, 1);
	}
	
}
