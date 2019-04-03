package com.class16;

public class Phone {
	
	String brand, color, model;
	double screenSize, camera;
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		
		phone1.brand = "iPhone";
		phone1.model = "X";
		phone1.screenSize = 5.6;
		phone1.camera = 12.5;
		System.out.println(phone1.brand);
		phone1.unlockSystem();
		phone1.portraitMode();
		
		
		Phone phone2 = new Phone();
		phone2.brand = "Pixel";
		phone2.model = "3 XL";
		phone2.screenSize = 5.6;
		phone2.camera = 12.5;
		System.out.println(phone2.brand);
		phone2.unlockSystem();
		phone2.portraitMode();
		
		
	}
	void unlockSystem() {
		if(brand.contains("iPhone")) {
		System.out.println("Unlock type: Face ID");
		}
		else {
			System.out.println("Unlock type: Finger print");
		}
	}
	void portraitMode() {
		System.out.println(brand + " has camera portrait mode");
	}

}
