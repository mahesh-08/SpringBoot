package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entites.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	// CRUD -> Create Read(2) Update Delete

	@Autowired
	private ProductService service;
	

	// http://localhost:8080/products/
	@RequestMapping("/")
	public Iterable<Product> getAllProducts() {
		return service.getAllProducts();
	}

	// http://localhost:8080/products/200 - get
	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		 return service.getProduct(productId);
	}
	
	
	// http://localhost:8080/products/200 - delete
	
	@RequestMapping(value="/{productId}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("productId")int productId) {
		 service.deleteProduct(productId);
	}
	
	// http://localhost:8080/products/  - post
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Product insertProduct(@RequestBody Product product ) {
		return service.insertProduct(product);
	}
	
	// http://localhost:8080/products/1002  - put
	@RequestMapping(value="/{productId}",method=RequestMethod.PUT)
	public Product updateProduct(@PathVariable("productId")int productId,Product product) {
		return service.updateProduct(productId, product);
	}
	
	
	
}
