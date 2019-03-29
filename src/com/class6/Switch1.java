package com.class6;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {

		char grade;

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your grade:");
		grade = input.next().charAt(0);

		switch (grade) {

		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Not Acceptable");
			break;
		}
		System.out.println("You grade is " + grade);

	}

}
