package com.productclientapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productclientapp.dto.Product;
import com.productclientapp.proxy.ProductClientProxy;

@RestController
public class ProductClientController {

	@Autowired
	private ProductClientProxy productClientProxy;
	
	//get all products
	@GetMapping(path = "productsclient")
	public List<Product> getAll(){
		ResponseEntity<List<Product>> allProductsResponseEntity = productClientProxy.getAll();
		List<Product> list=allProductsResponseEntity.getBody();
		
		System.out.println("----------------------------------");
		System.out.println(allProductsResponseEntity.getStatusCode());
		System.out.println(allProductsResponseEntity.getHeaders());
		
		System.out.println("----------------------------------");
		
		return list;
	}
	
	@GetMapping(path = "productsclient/{id}")
	public Product getAnProduct( @PathVariable(name = "id") int id){
		
		ResponseEntity<Product> oneProductsResponseEntity = productClientProxy.getAnProduct(id);
		Product product=oneProductsResponseEntity.getBody();
		
		System.out.println("----------------------------------");
		System.out.println(oneProductsResponseEntity.getStatusCode());
		System.out.println(oneProductsResponseEntity.getHeaders());
		
		System.out.println("----------------------------------");
		
		return product;
	}
	
	//get one product
	
	//update
	
	//delete
	

	@DeleteMapping(path = "productsclient/{id}")
	public String deleteAnProduct( @PathVariable(name = "id") int id){
		
		ResponseEntity<Void> oneProductsResponseEntity = productClientProxy.deleteAnProduct(id);
		
		System.out.println("----------------------------------");
		System.out.println(oneProductsResponseEntity.getStatusCode());
		System.out.println(oneProductsResponseEntity.getHeaders());
		
		System.out.println("----------------------------------");
		
		return "deleted ";
	}
	
	//add

	@PostMapping(path = "productsclient")
	public Product addAnProduct(@RequestBody  Product product){
		
		ResponseEntity<Product> oneProductsResponseEntity = productClientProxy.addAnProduct(product);
		
		System.out.println("----------------------------------");
		System.out.println(oneProductsResponseEntity.getStatusCode());
		System.out.println(oneProductsResponseEntity.getHeaders());
		
		System.out.println("----------------------------------");
		
		return product;
	}
}






