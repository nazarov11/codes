package com.class11;

public class TwoDArrays {
	public static void main(String[] args) {
		
		int[][] d = new int[4][4];
		
		d[0][0] = 12;
		d[0][1] = 13;			 
		d[0][2] = 14;
		d[0][3] = 15;
		
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
		
		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;
		
		d[3][0] = 100;
		d[3][1] = 200;
		d[3][2] = 300;
		d[3][3] = 400;
		
		int[][] c = {
				{34, 45, 67},
				{22, 44, 55},
				{4, 6, 8, 10},
		};
		int sumOfRow3 = 0;
		for(int row = 0; row < c.length; row++) {
			for(int col = 0; col < c[row].length; col++) {
				sumOfRow3 = sumOfRow3 + c[2][col];
				//System.out.print(c[row][col]);
				break;
			}
			//System.out.println();
		}System.out.println(sumOfRow3);
	}
	
	

}
