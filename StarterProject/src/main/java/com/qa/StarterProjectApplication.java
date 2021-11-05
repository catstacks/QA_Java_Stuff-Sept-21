package com.qa;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.plants.service.PlantService;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
		
		ApplicationContext appco = SpringApplication.run(SpringApplication.class, args);

		PlantService service = appco.getBean(PlantService.class);

		System.out.println(service);
		
//		Plants Herb1 = new Plants("Mint", 1, true);
//		Plants Herb2 = new Plants("Thyme",3, true);
//		Plants Herb3 = new Plants("Basil", 3, true);

		
	}

}
