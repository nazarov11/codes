package com.class24;

public class Programming {
	Programming() {
		System.out.println("I love programming languages");
	}
	Programming(String a) {
		System.out.println("I love " + a);
	}
	public static void main(String[] args) {
		
		Programming obj = new Programming();
		Programming obj1 = new Programming("Java");
	}

}
