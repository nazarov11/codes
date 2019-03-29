package com.class11;

public class LargestNum {
	
	public static void main(String[] args) {
		
		int[] nums = {3, 45, 23, 56, 21};
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i]>max) {
				max = nums[i];
				
			}
		}System.out.println(max);
	}

}
