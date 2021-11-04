package com.qa.plants.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.plants.domain.Plants;


public class PlantServiceList implements PlantService {
	
	private List<Plants> plantBuds = new ArrayList<>();

	@Override
	public Plants createPlant(Plants newPlantBuds) {
		this.plantBuds.add(newPlantBuds);
		return this.plantBuds.get(this.plantBuds.size() - 1);		
	}

	@Override
	public List<Plants> getALLPlants() {
		return this.plantBuds;
	}

	@Override
	public Plants getPlants(Integer id) {
		return this.plantBuds.get(id);
	}

	@Override
	public Plants replacePlant(Integer id, Plants newPlants) {
		return this.plantBuds.set(id, newPlants); // replaces the plant at that index
	}

	@Override
	public boolean removePlant(Integer id) {
		Plants toRemove = this.plantBuds.get(id);
		this.plantBuds.remove(id.intValue());
		return !this.plantBuds.contains(toRemove);
	}

}


