package com.qa.garage;

public class Bike extends Vehicle{
	
	private String isSeatComfy;
	private int age;
	
	// Method   
	public int fixVehicleCost() {
	  
		if(needsRepairs == true) {
			return 500 * (numberOfSeats + wheelCount);
	  } else {
		  	return 0;
	  }
  }
	
	// Getters and Setters
	public String getIsSeatComfy() {
		return isSeatComfy;
	}

	public void setIsSeatComfy(String isSeatComfy) {
		this.isSeatComfy = isSeatComfy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Constructors
	public Bike(int numberOfSeats, int wheelCount, String colour, boolean needsRepairs, String isSeatComfy, int age) {
		super(numberOfSeats, wheelCount, colour, needsRepairs);
		this.isSeatComfy = isSeatComfy;
		this.age = age;
	}
	
	
	
	

}
