package com.class13;
import java.util.Scanner;
public class teamTask6 {
	public static void main(String[] args) {
		
		
		String a;
		// char[] b = a.toCharArray();
		String reverse = "";
		
		Scanner input = new Scanner(System.in);
		a = input.nextLine();
		
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.substring(i, i + 1);

		}
		System.out.println(reverse);

		if (reverse.equalsIgnoreCase(a)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
