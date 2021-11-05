package com.qa.plants.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plants {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	
	private String name;
	private int ageInYears;
	private boolean hasBugs;
	
	public Plants(String name, int ageInYears, boolean hasBugs) {
		super();
		this.name = name;
		this.ageInYears = ageInYears;
		this.hasBugs = hasBugs;
	}
	
	public Plants() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
