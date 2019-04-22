package com.class23_2;

public class TestMainMethod {
	public static void main(String[] args) {
		MainMethodOverload.main();
		String[] a = {"hey", "wassup"};
		MainMethodOverload.main(a);
		System.out.println(a[0]);
	}

}
