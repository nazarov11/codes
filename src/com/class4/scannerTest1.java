package com.class4;
import java.util.Scanner;
public class scannerTest1 {
	public static void main(String[] args) {
		int loan = 0;
		int amount = 200000;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do you need?");
		loan = input.nextInt();
		
		if(loan <= amount) {
			System.out.println("Approved");
		}else {
			System.out.println("Rejected");
		}
		
		
		
	}
}
