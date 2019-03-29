package com.class12;

public class Recap {
	public static void main(String[] args) {
		
		int[][] values = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
		};
		for(int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[i].length; j++) {
				System.out.print(values[0][j] + " ");
				
			}
			break;
		}System.out.println();
		
		for(int[] singleArray : values) {
			for(int numbers : singleArray) { 
				
				System.out.print(numbers+ " ");
			}
		}
		
	}

}
