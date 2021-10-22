package com.qa.plant;

public class Plants {
	
	// Fields
	private String lifeStage;
	private int height;
    private String leaves;
    private boolean hasFruit;
    private boolean hasBugTenants;
    
    public void sway() {
        System.out.println("Gently swaying in the breeze...");
    }
    
    public void photosynthesise() {
        System.out.println("I am making O2 and eating CO2 for you!");
    }
    
    // Setters and Getters
    
    public String getLifeStage() {
		return lifeStage;
	}

	public void setLifeStage(String lifeStage) {
		this.lifeStage = lifeStage;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getLeaves() {
		return leaves;
	}

	public void setLeaves(String leaves) {
		this.leaves = leaves;
	}

	public boolean isHasFruit() {
		return hasFruit;
	}

	public void setHasFruit(boolean hasFruit) {
		this.hasFruit = hasFruit;
	}

	public boolean isHasBugTenants() {
		return hasBugTenants;
	}

	public void setHasBugTenants(boolean hasBugTenants) {
		this.hasBugTenants = hasBugTenants;
	}
    
    // Constructor - Constructors are 'methods' to create objects from a class
 	// Constructors have NO RETURN (doesn't mean void, means no return)
    
    public Plants(String lifeStage, int height, String leaves, boolean hasFruit, boolean hasBugTenants) {
	   super();
	   this.lifeStage = lifeStage;
	   this.height = height;
	   this.leaves = leaves;
	   this.hasFruit = hasFruit;
	   this.hasBugTenants = hasBugTenants;
	}
   
	

}

//Task - Create a Parent class of
//any type (animal, car whatever) with at least
//3 fields and 1 simple method.
//
//Create 2 child classes of that parent class
//with 2 specific fields and 1 extra method.
//Create objects of the child classes and run
//the methods from your main method


