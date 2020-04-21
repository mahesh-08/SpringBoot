package com.zensar.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	//@RequestMapping("/")
	@GetMapping("/")
	public Iterable<Product> getAllProducts() {
		return service.getAllProducts();
	}

	// http://localhost:8080/products/200 - get
	//@RequestMapping("/{productId}")
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		 return service.getProduct(productId);
	}
	
	
	// http://localhost:8080/products/200 - delete
	
	//@RequestMapping(value="/{productId}",method=RequestMethod.DELETE)
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId")int productId) {
		 service.deleteProduct(productId);
	}
	
	// http://localhost:8080/products/  - post
	//@RequestMapping(value="/",method=RequestMethod.POST)
	@PostMapping()
	public Product insertProduct(@RequestBody Product product ) {
		return service.insertProduct(product);
	}
	
	// http://localhost:8080/products/1002  - put
	//@RequestMapping(value="/{productId}",method=RequestMethod.PUT)
	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable("productId")int productId,Product product) {
		return service.updateProduct(productId, product);
	}
	
	
	
}
