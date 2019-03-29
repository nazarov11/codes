package com.class5;
import java.util.Scanner;
public class logOperatorsTask1 {
	
	public static void main(String[] args) {
		
		int height;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height?");
		
		height = input.nextInt();
		
		if(height < 5) {
			System.out.println("Short");
		}else if(height == 5 || height == 6) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
	}

}
