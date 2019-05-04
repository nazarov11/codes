package com.class28;

public interface WebDriver {
	void openBrowser();

	void closeBrowser();

	void maximizeBrowser();

	void findElement();
	
static void m1() {
	System.out.println("Java");
}

}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Double click on the icon Chrome");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Click on X Chrome");

		
	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Click on Maximize Chrome");

		
	}

	@Override
	public void findElement() {
		System.out.println("Click on search in Chrome");
		
	}
	
}
class FireFoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Double click on the icon Firefox");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Click on X Firefox");
		
	}

	@Override
	public void maximizeBrowser() {
		System.out.println("Click on Maximize Firefox");
		
	}

	@Override
	public void findElement() {
		System.out.println("Click on search in Firefox");
		
	}
	
}
