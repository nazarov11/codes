package com.class25;

public class Casting {
	public static void main(String[] args) {
		// implicit, automatic, widening - compiler takes care of conversion
		double a = 10;
		System.out.println(a);

		// explicit, manual, narrowing - programmer takes care of conversion
		double b = 10.0;
		int c = (int) b;
		System.out.println(c);

		int i = 129;
		byte by = (byte) i;
		System.out.println(by);

		// Upcasting - compiler takes care of conversion
		Payment pay = new masterCard();
		pay.makePayment();

		// downcasting
		masterCard mc1 = (masterCard) pay;
		mc1.makePayment();

	}

}
