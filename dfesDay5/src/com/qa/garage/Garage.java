package com.qa.garage;

import java.util.ArrayList;

public class Garage {

		
		public static ArrayList<Vehicle> garage = new ArrayList<>();

		
		public void addVehicle(Vehicle newVehicle) {		
			garage.add(newVehicle);
		
		}
		
		public void removeVehicle(int index) {
			
			garage.remove(index);
		}
		
		public void updateVehicle(int index, Vehicle newVehicle) {
		
			garage.set(index, newVehicle);
		}
		
		public Vehicle readVehicle(int index) {
		
			return garage.get(index);
		
		}
		
		public void emptyGarage() {
			
			garage.clear();
		}
		
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
