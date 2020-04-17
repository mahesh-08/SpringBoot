package com.zensar.services;

import java.util.List;

import com.zensar.entites.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public Product deleteProduct(int productId);
	
	public void insertProduct(Product product );
	
	public Product updateProduct(int productId,Product product);

}
