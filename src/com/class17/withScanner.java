package com.class17;
import java.util.Scanner;
public class withScanner {
	public static void main(String[] args) {
		withScanner obj = new withScanner();
		
		//Scanner input = new Scanner(System.in);
		//int a = input.nextInt();
		//int b = input.nextInt();
		//obj.largestNum(a, b);
		
		int c = obj.whatDay();
		System.out.println(c);
		
	}
	
	void largestNum(int a, int b) {
		
		
		if(a > b) {
			System.out.println(a +  " is larger than " + b);
		}
		else {
			System.out.println(b + " is larger than " + a);
		}
	}
	int whatDay() {
		return 5;
		
	}

}
