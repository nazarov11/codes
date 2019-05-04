package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			alist.add(i);
			
		}
		System.out.println(alist);
		
		Iterator<Integer> it = alist.iterator();
		while(it.hasNext()) {
			if(it.next()%2 != 0)
				it.remove();
			
		}
		System.out.print(alist);
	}

}
