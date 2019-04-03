package com.class16;

public class Computer {
	
	String make, OS;
	int RAM, Storage;
	boolean mouse = true, keyboard = true, screen = true;
	
	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		
		comp1.make = "Lenovo";
		comp1.Storage = 256;
		comp1.RAM = 8;
		comp1.OS = "Windows";
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = true;
		
		System.out.println(comp1.make);
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		
	}
	void watchMovie() {
		System.out.println("We can watch movie on " + make);
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on " + make);
	}
	void playMusic() {
		System.out.println("We can play music on " + make);
	}

}
