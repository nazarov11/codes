package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		int price;
		String item;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		item = input.next();
		System.out.println("Enter the price");
		price = input.nextInt();
		
		System.out.println("please pay for your item");
		int payment = input.nextInt();
		
	
		
		do {
			total = total + payment;
			int	change = total - price;
			if(total == price) {
				System.out.println();
			} else if(total > price) {
				System.out.println("here is your change " + change);
				break;
			} else {
				System.out.println("pay more");
				payment = input.nextInt();
			}
			
		}
		while (total != price);
			System.out.println("thanks");
			
		}
	}


