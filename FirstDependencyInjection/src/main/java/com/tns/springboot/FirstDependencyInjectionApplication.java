package com.tns.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstDependencyInjectionApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(FirstDependencyInjectionApplication.class, args);
		Customer customer=context.getBean(Customer.class);
		customer.display();
		customer.setCid(10);
		System.out.println("Customer id is:"+customer.getCid());
		customer.setCname("Ragnar lorthbrok");
		System.out.println("Customer name is:"+customer.getCname());
		customer.setCaddress("pune");
		System.out.println("Customer address is:"+customer.getCaddress());
		
		System.out.println();
		
		Product product=context.getBean(Product.class);
		product.show();
		product.setPid(11);
		product.setPname("Iphone i20");
		System.out.println("Product id is:"+product.getPid());
		System.out.println("product Name is:"+product.getPname());
	}

}
