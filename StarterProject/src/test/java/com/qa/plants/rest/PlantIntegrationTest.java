package com.qa.plants.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.plants.domain.Plants;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:plants-schema.sql",
"classpath:plants-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)

public class PlantIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate() throws Exception {
		Plants requestBody = new Plants("Mint", 1, true);
		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);
		
		RequestBuilder request = post("/plants/create").contentType(MediaType.APPLICATION_JSON)
				.content(requestBodyAsJSON);
		
		Plants responseBody = new Plants("Mint", 1, true);
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseBody);

		ResultMatcher checkStatus = status().isCreated(); 
		ResultMatcher checkBody = content().json(responseBodyAsJSON); 

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);

	
	}	
	
	@Test
	void testGetAll() throws Exception {

		RequestBuilder request = get("/plants/getAll");

		ResultMatcher checkStatus = status().isOk();

		Plants plant = new Plants("Mint", 1, true);
		List<Plants> plantBuds = List.of(plant);
		String responseBody = this.mapper.writeValueAsString(plantBuds);
		ResultMatcher checkBody = content().json(responseBody);

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

}
