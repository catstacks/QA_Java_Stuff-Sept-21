package com.qa.plants.domain;

public class Plants {
	
	private String name;
	private int ageInYears;
	private boolean hasBugs;
	
	public Plants(String name, int ageInYears, boolean hasBugs) {
		super();
		this.name = name;
		this.ageInYears = ageInYears;
		this.hasBugs = hasBugs;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeInYears() {
		return ageInYears;
	}

	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}

	public boolean isHasBugs() {
		return hasBugs;
	}

	public void setHasBugs(boolean hasBugs) {
		this.hasBugs = hasBugs;
	}
	
	
	public String toString() {
		return "Plant properties are as follows [name=" + name + ", age=" + ageInYears + ", hasBugs?=" + hasBugs + "]";
	}
	
	

}
