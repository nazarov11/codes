package com.class17_2;

public class nestedLoop1 {
	public static void main(String[] args) {
		nestedLoop1 demo = new nestedLoop1();
		
		demo.printNumber();
		
	}
	
	void printNumber() {
		for(int i = 5; i >= 1; i--) {
			
			for(int y = 5; y >= i; y--) {
				System.out.print(y);
				
			}
			System.out.println();
		}
	}

}
