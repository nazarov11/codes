package com.class17_2;

public class exercise1 {
	public static void main(String[] args) {
		
		
		exercise1 obj = new exercise1();
		obj.pattern();
	
	
	
	}
	protected void pattern() {
		
		for(int i = 1; i <= 7; i++) {
			
			for(int j = 1; j <= 7; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
