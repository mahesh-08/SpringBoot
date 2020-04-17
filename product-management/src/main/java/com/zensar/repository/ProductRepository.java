package com.zensar.repository;

import java.util.List;

import com.zensar.entites.Product;

public interface ProductRepository {
	
public List<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public Product deleteProduct(int productId);
	
	public void insertProduct(Product product );
	
	public Product updateProduct(int productId,Product product);

}
