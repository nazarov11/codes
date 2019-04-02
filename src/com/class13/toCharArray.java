package com.class13;

public class toCharArray {
	public static void main(String[] args) {
		
		String str = "saturday";
		char[] array = str.toCharArray();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
			
		}
		System.out.println("Reverse");
		for(int j = array.length - 1; j >= 0; j--) {
			System.out.println(array[j]);
		}
		
	}

}
