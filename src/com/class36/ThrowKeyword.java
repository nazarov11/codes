package com.class36;

public class ThrowKeyword {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		
	}
	public static void checkAgeEligibility(int age) {
		if(age >= 18) {
			System.out.println("Congrats");
		}
		else {
			throw new ArithmeticException("Not eligible");
		}
	}

}
