package com.class11;

public class Task2 {
	public static void main(String[] args) {
		
		String[] countries = {"Moldova", "Azerbaijan", "Tajiksitan"};
		
		for(int i = 0; i < countries.length; i++) {
			
			if (countries[i].equals("Moldova")){
				System.out.println("Kishinev");
				break;
			}
		}
		for(String country : countries) {
			System.out.println("Kishinev, Baku, Dushanbe");
			break;
		}
	}

}
