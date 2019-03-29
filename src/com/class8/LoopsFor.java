package com.class8;

public class LoopsFor {
	public static void main(String[] args) {
		
		int sumEven, i;
		sumEven = 0;
		for(i = 2; i <= 100; i = i + 2) {
			sumEven = sumEven + i;
			
		}
		System.out.println(sumEven);
	}

}
