package com.class12;

public class ForEachLoop2d {
	public static void main(String[] args) {
		
		String[][] groceries = {
				{"Apple", "Kiwi", "Melon", "Orange"},
				{"Tomato", "Potato", "Celery", "Cucumber"},
				{"Cheese", "Milk", "Sour Cream"}
		};
		
		for(String[] things : groceries) {
			for(String toBuy : things) {
				System.out.print(toBuy + " ");
			}System.out.println();
		}
		
		for(int i = 0; i < groceries.length; i++) {
			
			for(int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j]+ " ");
			}System.out.println();
		}
	}

}
