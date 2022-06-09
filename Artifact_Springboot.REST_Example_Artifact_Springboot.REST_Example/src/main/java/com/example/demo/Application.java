package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class);
		Product product=context.getBean(Product.class);
		product.setPid(1000);
		System.out.println("Product Id is:"+product.getPid());
		product.setPname("Mobile");
		System.out.println("Product Name is:"+product.getPname());
		product.setPrice(2000.00);
		System.out.println("Product price is:"+product.getPrice());
		product.setNoofproduct(10);
		System.out.println("Product Available is:"+product.getNoofproduct());
	}

}
