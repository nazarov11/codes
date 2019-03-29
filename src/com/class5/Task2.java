package com.class5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int quiz, midterm, finalExam;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your quiz score:");
		quiz = input.nextInt();

		System.out.println("Enter your midterm score:");
		midterm = input.nextInt();

		System.out.println("Enter your final exam score:");
		finalExam = input.nextInt();

		int average = (quiz + midterm + finalExam) / 3;

		if (average >= 90 && average <= 100) {
			System.out.println(average + "\nYour grade is A");
		} else if (average >= 70 && average <= 90) {
			System.out.println(average + "\nYour grade is B");
		} else if (average >= 50 && average <= 70) {
			System.out.println(average + "\nYour grade is C");
		} else if (average <= 50) {
			System.out.println(average + "\nYour grade is F");
		} else {
			System.out.println("Invalid");
		}
	}

}
