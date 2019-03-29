package com.class11;

public class Task4 {
	public static void main(String[] args) {
		
		int[][] num = {
				{34, 45, 67},
				{22, 44, 55},
				{4, 6, 8, 10},
		};
		
		int rows = num.length;
		System.out.println(rows);
		
		int cols = num[2].length;
		System.out.println(cols);
		
		for(int row = 0; row < num.length; row++) {
			
			for(int col = 0; col < num[row].length; col++) {
				System.out.print(num[row][col]+ " ");
			}
			System.out.println();
		}
		
	}
	

}
