package com.productclientapp.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.productclientapp.dto.Product;

@FeignClient(name = "product-app", url = "http://localhost:8080/products")
public interface ProductClientProxy {
	
	@GetMapping
	public ResponseEntity<List<Product>> getAll();

	@GetMapping(path = "{id}")
	public ResponseEntity<Product> getAnProduct(@PathVariable(name = "id")int id);

	@DeleteMapping(path = "{id}")
	public ResponseEntity<Void> deleteAnProduct(@PathVariable(name = "id")int id) ;
//
	@PostMapping
	public ResponseEntity<Product> addAnProduct(@RequestBody  Product product);
//
//	@PutMapping
//	public ResponseEntity<Product> udateAnProduct(@PathVariable(name = "id")int id,@RequestBody  Product product ) ;
}

