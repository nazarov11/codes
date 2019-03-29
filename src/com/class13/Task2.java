package com.class13;

public class Task2 {
	public static void main(String[] args) {
		
		String name = "Nazarov";
		
		if(!name.isEmpty()) {
			if(name.length()%2 == 1 && name.length() > 3) {
				
				System.out.println(name.charAt(name.length()/2));
			}
		}else {
			
		}
	}
	}

