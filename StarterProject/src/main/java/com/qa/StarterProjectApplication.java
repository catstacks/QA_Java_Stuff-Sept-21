package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.qa.plants.domain.Plants;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterProjectApplication.class, args);
//		Plants Herb1 = new Plants("Mint", 1, true);
//		Plants Herb2 = new Plants("Thyme",3, true);
//		Plants Herb3 = new Plants("Basil", 3, true);

		
	}

}
