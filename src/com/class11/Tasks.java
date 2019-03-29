package com.class11;

import java.util.Arrays;

public class Tasks {
	public static void main(String[] args) {
		String[][] countries = {
			
				{"USA", "Mexico", "Canada", "Salvador"},
				{"Germany", "Belgium", "Spain", "England", "Italy"},
				{"China", "Korea", "Japan", "Tajikistan"},
				{"Kongo", "Egypt", "Morocco", "Tunisia"}
						
				
		};
		
		
		for(int i = 0; i < countries.length; i++) {
			
			for(int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
