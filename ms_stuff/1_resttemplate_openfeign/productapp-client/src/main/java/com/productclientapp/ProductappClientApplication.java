package com.productclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductappClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappClientApplication.class, args);
	}
	
	//step 2: rest template: a bean
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
