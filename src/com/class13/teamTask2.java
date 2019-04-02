package com.class13;

public class teamTask2 {
	public static void main(String[] args) {
		int[] nums = {3000,  5000, 1000, 800, 270,500};
		int secondLargest = 0, maxNum = nums[0], minNum = nums[0];

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > maxNum) {
//				secondLargest = maxNum;
				maxNum = nums[i];
			}
			if(nums[i] < minNum)
				minNum = nums[i];
			if(nums[i] > secondLargest && nums[i] != maxNum) 
				secondLargest = nums[i];
		}
		System.out.println(maxNum);
		System.out.println(minNum);
		System.out.println(secondLargest);		
	}
}
