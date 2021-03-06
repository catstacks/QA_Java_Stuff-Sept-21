package com.qa.plants.rest;

import com.qa.plants.domain.Plants;

import com.qa.plants.service.PlantService;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Create - POST
//Read - GET
//Update - PUT, PATCH
//Delete - DELETE

@RestController
@RequestMapping(value = "/plants")
public class PlantsController {
	
	private List<Plants> plantBuds = new ArrayList<>();
	
	private PlantService service;
	
	public PlantsController(PlantService service) {
		super();
		this.service = service;
	}


	@GetMapping("/hello") // listen for a request at /hello
	public String hello() {
		return "Hello, World!"; // sends response
	}
	
	
	@GetMapping("/greenHouse/{id}")	
	public Plants getPlants(@PathVariable Integer id) {
		return this.plantBuds.get(id);
	
	}
	
	@PostMapping("/create") // triggered by a POST request to /create
	public ResponseEntity<Plants> createPlant(@RequestBody Plants newPlantBuds) {
		this.plantBuds.add(newPlantBuds);
		Plants responseBody = this.plantBuds.get(this.plantBuds.size() - 1);
		return new ResponseEntity<Plants>(responseBody, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Plants>> getPlants() {
		return ResponseEntity.ok(this.service.getALLPlants()); // unnecessary due to default being 200 anyway
	}
//	@GetMapping("/get/{id}") 
//	public Plants getPlant(@PathVariable Integer id) {
//		return this.plantBuds.get(id);
//	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Plants> replacePlant(@PathVariable Integer id, @RequestBody Plants newPlantBuds) {
		
		System.out.println("Replacing plant with id " + id + " with " + newPlantBuds);
		return null;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removePlant(@PathVariable Integer id) {
		System.out.println("Removing plant with id " + id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
