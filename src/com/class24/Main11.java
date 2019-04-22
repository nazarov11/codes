package com.class24;

public class Main11 {
	private void m() {
		System.out.println("Java");
	}
	private void m(String a) {
		System.out.println(a);
	}
	private void m(int s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Main11 obj = new Main11();
		
		obj.m();
		obj.m(11);
		obj.m("Syntax");
	}
}
