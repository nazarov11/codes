package com.class11;

import java.util.Arrays;

public class MinNum {
	public static void main(String[] args) {
		
		int[] nums = {50, 45, 19, 56, 21};
		int min =nums[0];
		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}System.out.println(min);
	}

}
