package com.techelevator;

public class DayOne {

	public static void main(String[] args) {
		
        int[] nums = new int[] {1,2,3,4};
		swapEnds(nums);
	}

	private static void swapEnds(int[] nums) {
		
		int temp = 0;
		
			temp = nums[0];
			nums[0] = nums[nums.length - 1];
			nums[nums.length - 1] = temp;
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

}
