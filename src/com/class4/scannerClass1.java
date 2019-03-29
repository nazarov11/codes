package com.class4;
import java.util.Scanner;

public class scannerClass1 {
	public static void main(String[] args) {
		
		String cityName;
		int temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your city ");
		cityName = input.nextLine();
		
		System.out.println("Please enter temperature in Fahreneit");
		temp = input.nextInt();
		
		int convertedTemp = (temp - 32) * 5/9;
		
		System.out.println("The temp in " + cityName + " is " + convertedTemp);
	}

}
