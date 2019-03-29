package com.class4;

import java.util.Scanner;

public class nestedIfTest {

	public static void main(String[] args) {

		int experience, salary;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many years of experience do you have?");
		experience = input.nextInt();
		
		System.out.println("What is your annual salary?");
		salary = input.nextInt();
		
		if(experience >= 5)
				if (salary > 50000){
				System.out.println("Eligible for 5000 Bonus");
				
				}else if(experience >= 5)
					if (salary < 50000){
						System.out.println("Eligible for 3000 Bonus");
					}
		 else {
			System.out.println("Not eligible for bonus");
		}
	}
}


