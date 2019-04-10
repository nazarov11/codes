package com.class20;

public class Main {
	public String a(String word) {
		//word = "Return";
		String reverse = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
			
	}
	
	public String s(String palindrome) {
		String reverse = "";
		String pal = "";
		for(int i = palindrome.length() - 1; i >= 0; i--) {
			reverse = reverse + palindrome.charAt(i);
			if(reverse.equalsIgnoreCase(palindrome)) {
				pal = "Palindrome";
			}
			else {
				pal = "Not Palindrome";
			}
		}
		return pal;
	}
	
	

}
