package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class drinks {
	public static void main(String[] args) {
		ArrayList<String> drink = new ArrayList<>();
		drink.add("tea");
		drink.add("cocktail");
		drink.add("coke");
		drink.add("coffee");
		
		
		
		
		for(int i = 0; i < drink.size(); i++) {
			if(drink.get(i).contains("a") || drink.get(i).contains("e"))
				drink.set(i, "Water");
			
		}
		System.out.println(drink);
	}

}
