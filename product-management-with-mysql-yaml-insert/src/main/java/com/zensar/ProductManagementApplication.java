package com.zensar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controller.ProductController;
import com.zensar.entites.Product;

@SpringBootApplication
public class ProductManagementApplication  {

	//@Autowired
	//private ProductController controller;
	//private static ConfigurableApplicationContext context;

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(ProductManagementApplication.class, args);
		test(context);
	}


	public static void test(ConfigurableApplicationContext context) throws Exception {
		System.out.println("++++++++++++++++++++++++++++++++++++++"+context);
		ProductController productController =  context.getBean("productController",ProductController.class);

		Product product = new Product();
		product.setProductId(1);
		product.setProductName("Mobile");
		product.setProductCost(10000);

		Product product2 = new Product();
		product2.setProductId(2);
		product2.setProductName("Laptop");
		product2.setProductCost(50000);

		// controller.insertProduct(product);

		// controller.insertProduct(product2);
		
		productController.insertProduct(product);
		productController.insertProduct(product2);

	}

}
