package com.zensar.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.entites.Product;
@Repository
public class ProductRepositoryImpl implements ProductRepository{
	
	List<Product> products = new ArrayList<>();

	public List<Product> getAllProducts() {
		return products;
	}

	public Product getProduct(int productId) {
		for (Product product : products) {
			if (product.getProductId() == productId) {
				return product;
			}
		}
		return new Product();
	}

	// http://localhost:8080/products/200 - delete

	public Product deleteProduct(int productId) {
		for (Product product : products) {
			if (product.getProductId() == productId) {
				products.remove(product);
			}
		}
		return new Product();
	}

	public void insertProduct(Product product) {
		products.add(product);
	}

	public Product updateProduct(int productId, Product product) {
		return null;
	}


}
