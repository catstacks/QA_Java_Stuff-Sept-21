package com.qa.plants.service;

import java.util.List;

import com.qa.plants.domain.Plants;

public interface PlantService {
	
	Plants createPlant(Plants newPlantBuds);

	List<Plants> getALLPlants();

	Plants getPlants(Integer id);

	Plants replacePlant(Integer id, Plants newPlantBuds);

	boolean removePlant(Integer id);

}
