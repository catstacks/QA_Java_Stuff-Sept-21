package com.qa.main;

public class Plant {
	
	public String lifeStage;
	public int height;
    public int leaves;
    public boolean hasFruit;
    public boolean hasBugTenants;
    
    public void sway() {
        System.out.println("Gently swaying in the breeze...");
    }
    
    public void photosynthesise() {
        System.out.println("I am making O2 and eating CO2 for you!");
    }
    
    // Constructor - Constructors are 'methods' to create objects from a class
 	// Constructors have NO RETURN (doesn't mean void, means no return)
    
    public Plant() {
    	
    	lifeStage = "Fully Grown";
    	height = 32;
    	leaves = 789;
    	hasFruit = false;
    	hasBugTenants = false;
    }
    
    public Plant(String lifeStage, int height, int leaves, boolean hasFruit, boolean hasBugTenants) {
	   super();
	   this.lifeStage = lifeStage;
	   this.height = height;
	   this.leaves = leaves;
	   this.hasFruit = hasFruit;
	   this.hasBugTenants = hasBugTenants;
	}
   
	

}
