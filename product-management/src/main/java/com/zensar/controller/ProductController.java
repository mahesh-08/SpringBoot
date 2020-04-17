package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entites.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	// CRUD -> Create Read(2) Update Delete

	List<Product> products = new ArrayList<>();

	public ProductController() {
		products.add(new Product(1001, "Mobile", 20000));
		products.add(new Product(1002, "Laptop", 50000));
	}

	// http://localhost:8080/products/
	@RequestMapping("/")
	public List<Product> getAllProducts() {
		return products;
	}

	// http://localhost:8080/products/200 - get
	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		 for(Product product:products) {
			 if(product.getProductId()==productId) {
				 return product;
			 }
		 }
		return new Product();
	}
	
	
	// http://localhost:8080/products/200 - delete
	
	@RequestMapping(value="/{productId}",method=RequestMethod.DELETE)
	public Product deleteProduct(@PathVariable("productId")int productId) {
		 for(Product product:products) {
			 if(product.getProductId()==productId) {
				products.remove(product);
			 }
		 }
		return new Product();
	}
	
	// http://localhost:8080/products/  - post
	@RequestMapping(value="/",method=RequestMethod.POST)
	public void insertProduct(@RequestBody Product product ) {
		products.add(product);
	}
	
	// http://localhost:8080/products/1002  - put
	@RequestMapping(value="/{productId}",method=RequestMethod.PUT)
	public Product updateProduct(@PathVariable("productId")int productId,Product product) {
		return null;
	}
	
	
	
}
