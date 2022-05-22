package com.productclientapp.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.productclientapp.dto.Product;

@RestController
public class ProductClientController {

	// 3. autowire resttemplate
	@Autowired
	private RestTemplate restTemplate;

	// 4. use it, i need to call another spring boot app: 8080..
	// http://localhost:8080/products

	// ------------getting all product using getForObject---------------
	@GetMapping(path = "productsclient")
	List<?> getAll() {
		
		return null;
	}

	// ------------getting an product using getForObject---------------
	@GetMapping(path = "productsclient/{id}")
	Product getAnProduct(@PathVariable(name = "id") int id) {
		return null;
	}
	// ------------getting an product using getForObject---------------
	@GetMapping(path = "productsclientV3/{id}")
	Product getAnProductusingForEntity(@PathVariable(name = "id") int id) {
		
		String url = "http://localhost:8080/products/{id}";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id", id);

		//response entity is a bag that contain 2 things : 1. data 2. status code
		ResponseEntity<Product> forEntity = restTemplate.getForEntity(url, Product.class, map);
		System.out.println("-----------------------------------");
		System.out.println(forEntity.getStatusCode());
		System.out.println(forEntity.getHeaders());
		System.out.println("-----------------------------------");
		return forEntity.getBody();
	}
	
	@GetMapping(path = "addproduct")
	public String getAnProductusingForEntity() {
		
		String url = "http://localhost:8080/products";
	
		Product product=new Product("pen", 1200);
												// url		data passing	what data type u want from the respt
		String response = restTemplate.postForObject(url, product, String.class);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(response);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		return "added successfully";
	}
	
	/*
	 * public void addCustomer(CustomerDTO customer) {
		String url = "http://localhost:8765/infybank/customers";
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject(url, customer,String.class);
		LOGGER.info(response);
        LOGGER.info("\n");
	}
	
	public void updateCustomer(CustomerDTO customerDTO) {
		String url = "http://localhost:8765/infybank/customers/{customerId}";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(url,customerDTO,customerDTO.getCustomerId());
		LOGGER.info("Customer updated successfully");
        LOGGER.info("\n");
	}
	 */
}


/*
 * // i will call another ws using restTemplate : xxxforObject xxxforEntity
		// exchange
		List<?> list = restTemplate.getForObject("http://localhost:8080/products", List.class);
 */




