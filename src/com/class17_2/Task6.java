package com.class17_2;
import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		
		int number;
		int desiredNum = 11;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 20");
		number = input.nextInt();
		
		do {
			if(number <= 10) {
				System.out.println("Too small");
				number = input.nextInt();
			}else if(number >= 12 && number <= 20) {
				System.out.println("Too large");
				number = input.nextInt();
				
			}else if(number > 20) {
				System.out.println("Invalid, enter again");
				number = input.nextInt();
				
			}
	
			
		}while (number != desiredNum);
		System.out.println("You got it");
	}

}
