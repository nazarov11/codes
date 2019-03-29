package com.class12;

public class StringManipulations3 {
	public static void main(String[] args) {
		
		String str = "Students";
		
		System.out.println(str.charAt(5));
		
		for(int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i) + ",");
			
			
			
		}
		
		//indexOf returns and index of specified character
		System.out.println();
		String str1 = "Sunday";
		int index = str1.indexOf("n");
		System.out.println(index);
		
		
		String str2 = "Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Technologies"));
		System.out.println(str2.indexOf(" "));
		
		//substring
		String str3 = "Today is Sunday java class";
		String newStr = str3.substring(9, 15);
		System.out.println(newStr);
	}
}