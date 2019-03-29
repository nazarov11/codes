package com.class4;

public class nestedIf {
	public static void main(String[] args) {
		double mortRate = 3.8;
		int mortPrice = 380000;

		if (mortRate > 4.5) {
			System.out.println("Will not buy the house");
		} else {
				System.out.println("Will consider buying");

				 if (mortPrice > 200000) {
				System.out.println("Will take a loan");
			} else {
				System.out.println("Will pay cash");
			}
		}
	}

}
