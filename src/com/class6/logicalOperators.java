package com.class6;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		int temp;
		String sunny = "sunny";
		String snowy = "snowy";
		String rainy = "rainy";

		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature?");
		temp = input.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("Is it rainy, snowy or sunny");
			rainy = input.next();
			if (rainy.equals("rainy")) {
				System.out.println("Go hiking");
			} else {
				System.out.println("Code");
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it rainy, snowy or sunny");
			snowy = input.next();
			if (snowy.equals("snowy")) {
				System.out.println("Go snowboarding");
			} else {
				System.out.println("Code");
			} 
		} else if (temp >= 80) {
			System.out.println("Is it rainy, snowy or sunny");
			sunny = input.next();
			if (sunny.equals("sunny")) {
				System.out.println("Go to the beach");
			} else {
				System.out.println("Code");
			}
		} else {
			System.out.println("Unknown");
		}
	}

}
