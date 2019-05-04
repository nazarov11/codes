package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("Care");
		words.add("java");
		words.add("face");
		words.add("water");
		
		Iterator<String> it = words.iterator();
		while(it.hasNext()) {
			if(it.next().endsWith("e"))
				it.remove();
		}
		System.out.println(words);
	}

}
