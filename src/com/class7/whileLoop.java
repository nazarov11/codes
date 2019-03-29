package com.class7;

public class whileLoop {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 50){
	        if(i == 5 || i == 7 || i == 8 || i == 9 ){
	        i++;
	        
	        	continue;
	        }
	        System.out.println(i);
			i++;
		}
	}

}
