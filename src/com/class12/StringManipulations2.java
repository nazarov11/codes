package com.class12;

public class StringManipulations2 {
	public static void main(String[] args) {
		
		String str = "Good morning, students!";
		System.out.println(str.contains("ing"));
		
		
		String present = "Welcome, Ali"; 
		System.out.println(present.contains("Welcome, "));
		
		String str2 = "Syntax ";
		
		System.out.println(str2.startsWith("S"));
		System.out.println(str2.endsWith("x"));
		
		String str1 = "Bye ";
		System.out.println(str1.isEmpty());
		
		System.out.println(str1.concat(str2));
		
		String expected = "Syntax Technologies, Fairfax";
		String actual = "   Syntax Technologies, Fairfax   ";
		
		actual = actual.trim();
		System.out.println(expected.equals(actual));
	}

}
