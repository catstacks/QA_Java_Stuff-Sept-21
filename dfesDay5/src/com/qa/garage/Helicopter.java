package com.qa.garage;

public class Helicopter extends Vehicle{
	
	private boolean hasCockpit;
	private int bladeCount;
	
	// Method   
	public int fixVehicleCost() {
	  
		if(needsRepairs == true) {
			return 500 * (numberOfSeats + wheelCount);
	  } else {
		  	return 0;
	  }
  }
	
	// Getters and Setters
	public boolean isHasCockpit() {
		return hasCockpit;
	}

	public void setHasCockpit(boolean hasCockpit) {
		this.hasCockpit = hasCockpit;
	}

	public int getBladeCount() {
		return bladeCount;
	}

	public void setBladeCount(int bladeCount) {
		this.bladeCount = bladeCount;
	}
	
	// Constructors
		public Helicopter(int numberOfSeats, int wheelCount, String colour, boolean needsRepairs, boolean hasCockpit, int bladeCount) {
			super(numberOfSeats, wheelCount, colour, needsRepairs);
			this.hasCockpit = hasCockpit;
			this.bladeCount = bladeCount;
		}

}
