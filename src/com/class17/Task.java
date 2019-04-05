package com.class17;

public class Task {
	public static void main(String[] args) {
		Task obj = new Task();
		
		obj.numbers(33);
		
	}
	
	void numbers(int a) {
		if (a%2 == 0) {
			System.out.println(a + " is even");
		}
		else {
			System.out.println(a + " is odd");
		}
	}

}
