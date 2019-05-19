package com.class36;

public class Task {
	public static void funds(int a) {
		if(a < 500) {
			System.out.println("Please receive" + a);
		}
		else {
			throw new ArithmeticException("Not enough money");
		}
	}
	public static void main(String[] args) {
		
		funds(6000);
	}

}
