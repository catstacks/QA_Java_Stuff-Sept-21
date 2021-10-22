package com.qa.garage;

public class Car extends Vehicle{
	
	private boolean isRareCollectible;
	private int mphSpeed;
	
	// Method   
	public int fixVehicleCost() {
	  
		if(needsRepairs == true) {
			return 500 * (numberOfSeats + wheelCount);
	  } else {
		  	return 0;
	  }
  }
	
	// Getters and Setters
	public boolean isRareCollectible() {
		return isRareCollectible;
	}

	public void setRareCollectible(boolean isRareCollectible) {
		this.isRareCollectible = isRareCollectible;
	}

	public int getMphSpeed() {
		return mphSpeed;
	}

	public void setMphSpeed(int mphSpeed) {
		this.mphSpeed = mphSpeed;
	}
	
	// Constructors
	public Car(int numberOfSeats, int wheelCount, String colour, boolean needsRepairs, boolean isRareCollectible, int mphSpeed) {
		super(numberOfSeats, wheelCount, colour, needsRepairs);
		this.isRareCollectible = isRareCollectible;
		this.mphSpeed = mphSpeed;
	}
	


}
