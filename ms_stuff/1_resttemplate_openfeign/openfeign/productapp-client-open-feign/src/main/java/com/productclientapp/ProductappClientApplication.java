package com.productclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients("com.productclientapp.proxy")
@SpringBootApplication
public class ProductappClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductappClientApplication.class, args);
	}
	
}
