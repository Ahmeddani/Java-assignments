package com.techelevator;

public class DayOne {

	public  int[] swapEnds(int[] nums) {
		
		int temp = 0;
		
			temp = nums[0];
			nums[0] = nums[nums.length - 1];
			nums[nums.length - 1] = temp;
			return nums;
		}
             
	public boolean has12(int[] nums) {
		int temp1 = 0;
		int temp2 = 0;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
			    temp1 = i;
			}
			if(nums[i]== 2) {
				temp2 = i;
			}
			if(temp1 < temp2) {
				return true;
			}
		}
		return false;
	}
}
