package com.qa.plants.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.plants.domain.Plants;



	@Repository
	public interface PlantRepoDB extends JpaRepository<Plants, Integer> {

	}



