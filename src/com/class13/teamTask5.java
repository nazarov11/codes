package com.class13;

public class teamTask5 {
	public static void main(String[] args) {
		String a = "Welcome to VA";
		char[] b = a.toCharArray();
		
		for(int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);
			
		}
		System.out.println();
		String[] c = a.split(" ");
		
		for(int j = c.length - 1; j >= 0; j--) {
			
			System.out.print(c[j] + " ");
		}
		
	}

}
