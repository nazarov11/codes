package com.class8;

public class ForLoops {
	public static void main(String[] args) {
		int i, j, k, l, m, n;
		for(i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		for(j = 100; j >= 1; j--) {
			System.out.println(j);
		}
		for(k = 1; k <= 20; k++) {
			System.out.println(k);
			k = k + 2;
		}
		for(l = 20; l >= 1; l = l-2) {
			System.out.println(l);
			
		}
		for(m = 20; m <= 50; m = m+2) {
			System.out.println(m);
		}
		for(n = 20; n <= 50; n++) {
			if(n%2 != 0) {
			System.out.println(n);
			}
		}
		
	}
	

}
