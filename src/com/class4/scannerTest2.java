package com.class4;

import java.util.Scanner;

public class scannerTest2 {
public static void main(String[] args) {
	int age = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("How old are you?");
	age = input.nextInt();
	
	if(age >= 18) {
		System.out.println("Congrats");
	} else if(age < 16) {
		System.out.println("Naaaaah man!");
	} else {
		System.out.println("Need to get a learners permit");
	}
	
}
}
