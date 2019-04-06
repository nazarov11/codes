package com.class17_2;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			
			int leapYear;
			Scanner input = new Scanner(System.in);
			System.out.println("enter a leap year");
			leapYear = input.nextInt();
			
			if(leapYear % 4 == 0 || leapYear % 400 == 0) {
				System.out.println("It is a leap year");
				break;
			}else {
				System.out.println("It is not a leap year");
			}
		}
	}

}
