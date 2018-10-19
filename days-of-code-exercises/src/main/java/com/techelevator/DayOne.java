package com.techelevator;

public class DayOne {

	public  int[] swapEnds(int[] nums) {
		
		int temp = 0;
		
			temp = nums[0];
			nums[0] = nums[nums.length - 1];
			nums[nums.length - 1] = temp;
			return nums;
		}
             
}
