package com.class13;

public class teamTask {
	public static void main(String[] args) {
		
		int x, y;
		x = 20;
		y = 15;
		x = x + y;// x = 35
		y = x - y;// y = 20
		x = x - y; // x = 15
		System.out.println(x);
		System.out.println(y);
		
		String a = "Pen";
		String b = "Pencil";
		System.out.println(a.replace(a, b));
		System.out.println(b.replace(b, a));
		
	}

}
