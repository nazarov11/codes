package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(15);
		numbers.add(20);
		numbers.add(23);
		numbers.add(33);
		int count = 0;
		
		while(numbers.size() > count) {
			System.out.println(numbers.get(count));
			count++;
		}
		
		//numbers.set(2, 333);
		//System.out.println(numbers.get(2));
		
//		for(Integer num: numbers) {
//			System.out.println(num);
//		}
	}

}
