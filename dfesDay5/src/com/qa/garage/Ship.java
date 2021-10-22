package com.qa.garage;

public class Ship extends Vehicle{
	
	private boolean isSunken;
	private boolean hasPirates;
	
	// Method   
	public int fixVehicleCost() {
	  
		if(needsRepairs == true && hasPirates == false) {
			return 500 * (numberOfSeats + wheelCount);
	  } else {
		  	return 0;
	  }
  }

	// Getters and Setters
	public boolean isSunken() {
		return isSunken;
	}

	public void setSunken(boolean isSunken) {
		this.isSunken = isSunken;
	}

	public boolean isHasPirates() {
		return hasPirates;
	}

	public void setHasPirates(boolean hasPirates) {
		this.hasPirates = hasPirates;
	}
	
	// Constructors
		public Ship(int numberOfSeats, int wheelCount, String colour, boolean needsRepairs, boolean isSunken, boolean hasPirates) {
			super(numberOfSeats, wheelCount, colour, needsRepairs);
			this.isSunken = isSunken;
			this.hasPirates = hasPirates;
		}

}
