package com.orderapp.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.orderapp.dto.Coupon;
import com.orderapp.dto.Customer;
import com.orderapp.dto.Order;
import com.orderapp.dto.OrderRequest;
import com.orderapp.dto.Product;

@RestController
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(path = "orders")
	public ResponseEntity<Order> bookOrder( @RequestBody OrderRequest orderRequest){
		
		return null;
	}
	
	
}







