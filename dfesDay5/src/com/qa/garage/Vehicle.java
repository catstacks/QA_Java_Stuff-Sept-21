package com.qa.garage;

public class Vehicle {
	
	// Fields
	private int numberOfSeats;
	private int wheelCount;
	private String colour;
	private boolean needsRepairs;
	    
	    
	// Method   
	public int fixVehicleCost() {
	  
		if(needsRepairs == true) {
			return 500 * (numberOfSeats + wheelCount);
	  } else {
		  	return 0;
	  }
  }

	// Getters and Setters	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public int getWheelCount() {
		return wheelCount;
	}


	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean isNeedsRepairs() {
		return needsRepairs;
	}


	public void setNeedsRepairs(boolean needsRepairs) {
		this.needsRepairs = needsRepairs;
	}
	
	//Constructors
	
	public Vehicle(int numberOfSeats, int wheelCount, String colour, boolean needsRepairs) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.wheelCount = wheelCount;
		this.colour = colour;
		this.needsRepairs = needsRepairs;
				
	}
	
}