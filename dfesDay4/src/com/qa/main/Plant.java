package com.qa.main;

public class Plant {
	
	public String name;
	public int height;
    public int leaves;
    public boolean hasFruit;
    public boolean hasBugTenants;
    
    public void sway() {
        System.out.println("Gently swaying in the breeze...");
    }
    
    public void photosythesise() {
        System.out.println("I am making O2 and eating CO2 for you!");
    }
    
    public Plant(String name, int height, int leaves, boolean hasFruit, boolean hasBugTenants) {
	   super();
	   this.name = name;
	   this.height = height;
	   this.leaves = leaves;
	   this.hasFruit = hasFruit;
	   this.hasBugTenants = hasBugTenants;
	}
   
	

}
