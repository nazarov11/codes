package com.class25;

public class FinalKeyword {

	public static final String name = "Syntax";

	public static void main(String[] args) {

		final String str = "Hello"; // constant value
		// str = "John"; wont work
		// name = "";
	}

	final void m() {
		System.out.println("Java");
	}

	final void m(int a) {
		System.out.println(a);
	}
}

class Child extends FinalKeyword {
//	final void m() {
//		System.out.println("Java");
//	}
//	
}
