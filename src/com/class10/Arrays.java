package com.class10;

public class Arrays {
	public static void main(String[] args) {
		int[] array = new int[4];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;

		
		System.out.println(array[1]);
		int[] numbers = {34, 56, 67};
		
		for(int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
		}
		int[] nums = {23, 45,78, 90};
		
		for(int num : nums) {
			System.out.print(num);
		}
	}
}
