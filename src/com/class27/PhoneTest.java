package com.class27;

public class PhoneTest {
	public static void main(String[] args) {
		Phone obj = new iPhone();
		obj.makeCall();
		obj.sendText();
		obj.unlockPhone();
		obj.viewPictures();
		
		Phone obj1 = new Samsung();
		obj1.makeCall();
		obj1.sendText();
		obj1.unlockPhone();
		obj1.viewPictures();
			
		
	}

}
