package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		//ArrayDemo_1.squareNum();
		
		// Plant is the data type 
		// housePlant is the name of the object
		// Equal to new Plant (The method we're using)
				Plant housePlant = new Plant();
				System.out.println(housePlant.lifeStage);
				System.out.println(housePlant.height);
				System.out.println(housePlant.leaves);
				System.out.println(housePlant.hasBugTenants);
				housePlant.photosynthesise();

	}

}

//Static methods belong to classes 
// non static belong to objects
