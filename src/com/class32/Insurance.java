package com.class32;

public abstract class Insurance {
	public String insuranceName;
	Insurance(String insuranceName){
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
	

}
class Car extends Insurance{
	Car(String insuranceName){
		super(insuranceName);
	}
	
	public String carModel = "Jeep";
	@Override
	public void getQuote() {
		System.out.println(insuranceName + " 150$ " + carModel);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " cancel anytime");
		
	}
}
class Pet extends Insurance{
	Pet(String insuranceName){
		super(insuranceName);
	}
	public String petType = "Labrador";
	
	@Override
	public void getQuote() {
		System.out.println(insuranceName + " 100$ " + petType);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " cancel anytime");
		
	}
}
class Health extends Insurance{
	Health(String insuranceName){
		super(insuranceName);
	}
	

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " 200$");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " cancel anytime");
		
	}
}
