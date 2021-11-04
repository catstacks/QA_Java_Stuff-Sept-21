package com.qa.plants.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.plants.domain.Plants;

public class PlantRepoDB {

	@Repository
	public interface PlantRepo extends JpaRepository<Plants, Integer> {

	}


}
