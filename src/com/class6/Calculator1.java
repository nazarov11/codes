package com.class6;
import java.util.Scanner;
public class Calculator1 {
	public static void main(String[] args) {

		int num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter your second number: ");
		num2 = input.nextInt();
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for divison");
		result = input.nextInt();
		switch (result) {
		
		case 1:
			result = num1 + num2;
			System.out.println(result);
			break;
		case 2: 
			result = num1 - num2;
			System.out.println(result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println(result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println(result);
			break;
			default:
				System.out.println("Nothing");
				break;
				
		}
		
	}
}
