package com.class11;

public class multiDimensional {
	public static void main(String[] args) {
		
		String[][] food = {
				
				{"burger", "fries"},
				{"water", "soda"},
				{"plov", "chick peas"}
				
		};
		
		for(int i = 0; i < food.length; i++) {
			
			for(int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + " ");
			}
			System.out.println();
		}
	}

}
