package com.class8;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		
		int startNum, endNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a starting number");
		startNum = input.nextInt();
		
		System.out.println("Please enter ending number");
		endNum = input.nextInt();
		
		if(startNum < endNum) {
		
			for(int i = startNum; i <= endNum; i++) {
			System.out.println(i);
			}
		
		} else {
			System.out.println("I wont run your code");
		}
	}

}
