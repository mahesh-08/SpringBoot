package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controller.ProductController;
import com.zensar.entites.Product;

@SpringBootApplication
public class ProductManagementApplication  { //implements CommandLineRunner

	//@Autowired
	//private ProductController controller;
	//private static ConfigurableApplicationContext context;

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(ProductManagementApplication.class, args);
		
		//ConfigurableApplicationContext context = SpringApplication.run(ProductManagementApplication.class, args);
		//test(context);
	}


	public static void test(ConfigurableApplicationContext context) throws Exception {
	
		ProductController productController =  context.getBean("myCtrl",ProductController.class);

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
