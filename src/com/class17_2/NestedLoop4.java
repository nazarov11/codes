package com.class17_2;
import java.util.Scanner;
public class NestedLoop4 {
	public static void main(String[] args) {

		int num1, num2;
		int sumOdd = 0;
		int sumEven = 0;
		int even = 0;
		int odd = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a range of numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			
			if(i%2 == 0) {
				sumEven = even + i;
				
			}else {
				sumOdd = odd + i;
				
			}
			
		}System.out.println(sumEven);
		System.out.println(sumOdd);
		
		
	}
}
