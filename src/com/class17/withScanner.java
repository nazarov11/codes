package com.class17;
import java.util.Scanner;
public class withScanner {
	public static void main(String[] args) {
		withScanner obj = new withScanner();
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int d = obj.largestNum(a, b);
		System.out.println(d + " is largest");
		
		int c = obj.whatDay();
		System.out.println(c);
		
	}
	
	private int largestNum(int a, int b) {
		
		
		if(a > b) {
			//System.out.println(a +  " is larger than " + b);
			return a;
		}
		else {
			//System.out.println(b + " is larger than " + a);
			return b;
		}
	}
	int whatDay() {
		return 5;
		
	}

}
