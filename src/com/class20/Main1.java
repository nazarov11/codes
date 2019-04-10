package com.class20;

public class Main1 {
	private String s(String smth) {
		
		String[] b = smth.split(" ");
		String printSeparate = "";

		
		for(int i = 0; i < b.length; i++) {
			printSeparate = printSeparate + b[i] + "\n";
				
		}
		
		return printSeparate;
		
	}
	public static void main(String[] args) {
		Main1 obj = new Main1();
		
		System.out.println(obj.s("hello friend man people book"));
	}

}
