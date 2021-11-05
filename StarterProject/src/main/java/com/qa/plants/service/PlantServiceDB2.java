package com.qa.plants.service;

import java.util.List;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.plants.domain.Plants;
import com.qa.plants.repos.PlantRepoDB;
	
@Service	
public class PlantServiceDB2 implements PlantService {

	private PlantRepoDB repo;
	
	public PlantServiceDB2(PlantRepoDB repo) {
		super();
		this.repo = repo;
	}

		@Override
		public Plants createPlant(Plants newPlantBud) {
			return this.repo.save(newPlantBud);
		}

		@Override
		public List<Plants> getALLPlants() {
			return this.repo.findAll();
		}

		@Override
		public Plants getPlants(Integer id) {
			Optional<Plants> plantOptional = this.repo.findById(id);

			if (plantOptional.isPresent()) {
				Plants plant = plantOptional.get();
				return plant;
			} else {
				throw new EntityNotFoundException("No plant found with id: " + id);
			}
		}

		@Override
		public Plants replacePlant(Integer id, Plants newPlantBud) {
			Plants existing = this.getPlants(id);

			existing.setName(newPlantBud.getName());
			existing.setAgeInYears(newPlantBud.getAgeInYears());
			existing.setHasBugs(newPlantBud.isHasBugs());
			

			return this.repo.save(existing);
		}

		@Override
		public boolean removePlant(Integer id) {
			this.repo.deleteById(id);
			return !this.repo.existsById(id);
		}


	}
