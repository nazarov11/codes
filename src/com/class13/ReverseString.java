package com.class13;

public class ReverseString {
	public static void main(String[] args) {
		
		//reverse a string without using reverse function
		String original = "Today is Java Class";
		String reverse = "";
		char[] array = original.toCharArray();
		
		for(int i = array.length -1; i >= 0; i--) {
			System.out.print(array[i]);
			//reverse = reverse + array[i];
			
		}
		System.out.println();
		
		//charAt
		
		for(int j = original.length() - 1; j >= 0; j--) {
			
			System.out.print(original.charAt(j));
		}
		System.out.println();
		for(int k = original.length() - 1; k >= 0; k--) {
			reverse = reverse + original.substring(k, k+1);
			
			
			
		}System.out.println(reverse);
	}

}
