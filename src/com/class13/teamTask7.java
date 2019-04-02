package com.class13;
import java.util.Scanner;

public class teamTask7 {
	public static void main(String[] args) {
		
		int number;
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		if(number / number == 1 && number / 1 == number && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
			System.out.println("It is prime");
		}
		else if(number == 2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	 
	

}
