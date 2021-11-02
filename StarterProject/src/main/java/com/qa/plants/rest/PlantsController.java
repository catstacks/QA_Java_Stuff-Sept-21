package com.qa.plants.rest;

import com.qa.plants.domain.Plants;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Create - GET
//Read - POST
//Update - PUT, PATCH
//Delete - DELETE

@RestController
public class PlantsController {
	private List<Plants> plantBuds = new ArrayList<>();
	
	@GetMapping("/greenHouse/{id}")
	
	public Plants getPlants(@PathVariable Integer id) {
		return this.plantBuds.get(id);
	
	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Plants> replacePlant(@PathVariable Integer id, @RequestBody Plants newPlant) {

		System.out.println("Replacing plant with id " + id + " with " + newPlant);
		return null;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removePlant(@PathVariable Integer id) {
		System.out.println("Removing plant with id " + id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
