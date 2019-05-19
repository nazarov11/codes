package com.class35;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		try {
			int num = input.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("Integer integer");
		}
		
	}

}
