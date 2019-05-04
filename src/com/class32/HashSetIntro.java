package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		hset.add(12);
		hset.add(33);
		hset.add(11);
		hset.add(11);
		String[] arr = new String[hset.size()];
		hset.toArray(arr);
	
		
	
		//Set does not keep the order
//		System.out.println(hset.size());
//		System.out.println(hset);
//		for(int num: hset) {
//			System.out.println(num);
//		}
		Iterator<Integer> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	//	System.out.println(hset);
	}
}
