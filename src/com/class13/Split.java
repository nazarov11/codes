package com.class13;

public class Split {
	public static void main(String[] args) {
		
		String str = "Welcome Syntax Students Batch 4";
		String[] array = str.split("S");
		System.out.println(array.length);
		
		for(String substring: array) {
			System.out.println(substring);
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	}

}
