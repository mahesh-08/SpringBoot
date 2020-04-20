package com.zensar.services;

import com.zensar.entites.Product;

public interface ProductService {
	
	public Iterable<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public void deleteProduct(int productId);
	
	public Product insertProduct(Product product );
	
	public Product updateProduct(int productId,Product product);

}
