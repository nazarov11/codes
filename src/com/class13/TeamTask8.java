package com.class13;

public class TeamTask8 {
	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 0;
		array[1] = 1;
		System.out.print(array[0] + " " + array[1] + " ");
		for(int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
			
			System.out.print(array[i] + " ");
		}
	}
	

}
