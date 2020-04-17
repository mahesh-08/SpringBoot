package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entites.Product;
import com.zensar.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	

	public List<Product> getAllProducts() {
		return repository.getAllProducts();
	}

	public Product getProduct(int productId) {
		return repository.getProduct(productId);
	}

	// http://localhost:8080/products/200 - delete

	public Product deleteProduct(int productId) {
		return repository.deleteProduct(productId);
	}

	public void insertProduct(Product product) {
		repository.insertProduct(product);
	}

	public Product updateProduct(int productId, Product product) {
		return repository.updateProduct(productId, product);
	}

}
