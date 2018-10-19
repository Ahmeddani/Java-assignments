package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DayOneTest {

DayOne dayOne; 
int[] nums;
@Before
public void setup() {
	dayOne = new DayOne();
}

@Test
public void test_swap_end_with_2_values() {
	nums = new int[] {1,2};
	int[] result =  dayOne.swapEnds(nums);
	Assert.assertEquals(2, result[0]);
	Assert.assertEquals(1, result[1]);
}

@Test
public void test_swap_end_with_6_values() {
	nums = new int[] {9,2,3,0,5,6};
	int[] result =  dayOne.swapEnds(nums);
	Assert.assertEquals(6, result[0]);
	Assert.assertEquals(9, result[5]);
}
}
