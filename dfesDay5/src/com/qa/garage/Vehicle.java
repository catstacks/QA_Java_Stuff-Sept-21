package com.qa.garage;

import java.util.ArrayList;

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
	}
	
	//public static ArrayList<Vehicle>  = new ArrayList<>();

	
	//public static void addVehicle(vehicle newVehicle) {		
		//arrayname.add("Small Espresso");
	
	//}
	
	//public static void removeVehicle(int index) {
		
		//arrayname.add(null);
	//}
	
	//public static void updateVehicle(int index, String newOrder) {
	
	//System.out.println(orders);
	
	//orders.add(null);
//}
	
	//public static void readVehicle(int index, String newOrder) {
	
	//System.out.println(orders);
	
	//orders.add(null);
//}
	
	//public static void removeAllVehicle(int index) {
		
		//System.out.println(orders);
		
		//orders.add(null);
	//}
	

//}
}

//The task is to create a garage class with methods for the following:
//- Adding Vehicles to garage
//- Removing vehicles
//- Updating vehicles
//- Reading vehicle
//- Removing all vehicles
//- Running vehicle.fixVehicle() custom method
//Vehicles
//Vehicle should be a base class (parent) with at least 3 fields
//and a fixVehicle() method
//
//You should create at least 3 child classes extending off of Vehicle 
//(car, bike, helicopter)
//Each child class should inherit the fields AND have 2 specific fields