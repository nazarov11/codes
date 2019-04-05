package com.class17;

public class Task2 {
	public static void main(String[] args) {
		
		Task2 obj = new Task2();
		
		obj.palindrome("anna");
		
		
		
	}
	void palindrome(String word) {
		
		String reverse = "";
		for(int i = word.length() - 1; i >= 0; i--) {
		
			reverse = reverse + word.substring(i, i+1);
			
		}
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println(word + " is palindrome");
			
		}
		else {
			System.out.println(word + " is not palindrome");
		}
	}

}
