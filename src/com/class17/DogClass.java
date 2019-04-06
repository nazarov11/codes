package com.class17;

public class DogClass {
	String Husky, Bulldog, Labrador;
	
	
	public static void main(String[] args) {
		DogClass Husky = new DogClass();
		Husky.bark("Husky");
		Husky.run("Husky");
		Husky.play("Husky");
		
		
		DogClass Bulldog = new DogClass();
		Bulldog.bark("Bulldog");
		Bulldog.run("Bulldog");
		Bulldog.play("Bulldog");
	
		
		DogClass Labrador = new DogClass();
		Labrador.bark("Labrador");
		Labrador.run("Labrador");
		Labrador.play("Labrador");
		
		
		
	}
	void bark(String breed) {
		System.out.println(breed + " can bark");
	}
	void play(String breed) {
		System.out.println(breed + " can play");
	}
	void run(String breed) {
		System.out.println(breed + " can run");
	}

}
