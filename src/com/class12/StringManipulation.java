package com.class12;

public class StringManipulation {
	public static void main(String[] args) {

		// Length function
		// Returns number of characters of the String

		String str = "Syntax";

		int lengthOfString = str.length();
		System.out.println(lengthOfString);

		String str1 = "Syntax Technologies";
		int lengthOfString2 = str1.length();
		System.out.println(lengthOfString2);

		String str2 = "Welcome, students!";
		System.out.println(str2.length());
		
		//Convert all characters to lower and upper case
		String str3 = "Hello";
		String newString = str3.toUpperCase();
		System.out.println(newString);
		System.out.println(newString.toLowerCase());
		
		//Comparing 2 strings if they are the same
		String str4 = "Hello";
		String str5 = "hello";
		
		boolean equality = str4.equals(str5);
		System.out.println(equality);
		
		
		String expectedBrowser = "Chrome";
		String actualBrowser = "chrome";
		boolean equals = expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);

	}

}
