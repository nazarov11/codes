package com.class27;

public abstract class Phone { // abstract class
	public void makeCall() {
		System.out.println("Phone can make call");
	}

	public void sendText() {
		System.out.println("Phone can send texts");
	}

	public abstract void unlockPhone();

	public abstract void viewPictures();

}

class iPhone extends Phone { // concrete class - is class that is inherited from an abstract class or
								// implemented by interface and providing complete implementation of all
								// unimplemented
								// abstract classes
	iPhone(){
		System.out.println("--------Iphone");
	}
	@Override
	public void unlockPhone() {
		System.out.println("Face ID");
	}

	@Override
	public void viewPictures() {
		System.out.println("Go to Pictures");
	}

}

class Samsung extends Phone {
	Samsung(){
		System.out.println("-------Samsung");
	}
	@Override
	public void unlockPhone() {
		System.out.println("Fingerprint");
	}
	@Override
	public void viewPictures() {
		System.out.println("Go to Gallery");
	}
}
