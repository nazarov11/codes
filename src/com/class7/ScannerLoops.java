package com.class7;
import java.util.Scanner;
public class ScannerLoops {
	public static void main(String[] args) {
		
		int a = 0;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		while (a <= 3) {
			System.out.println("Please enter your name");
			name = input.next();
			
			System.out.println("You are doing great " + name);
			a++;
		}
	}

}
