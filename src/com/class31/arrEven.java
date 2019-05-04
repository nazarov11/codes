package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class arrEven {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 2; i <= 50; i = i+2) {
			numbers.add(i);
						
		}
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			if(it.next()%5 == 0)
				it.remove();
			
			
		}
		System.out.print(numbers);
	}

	

}
