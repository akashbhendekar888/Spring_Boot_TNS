package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Maruti implements DemoCar{

	@Override
	public void speed() {
		System.out.println("Maruti is good to speed");
		
	}
@Component
class Mahindra implements DemoCar{

	@Override
	public void speed() {
		System.out.println("Mahindra Car good to speed");
		
	}	
	
}
	
	
}
@SpringBootApplication
public class Cars {
	public static void main(String []args) {
		SpringApplication.run(Cars.class, args);
		
		AnnotationConfigApplicationContext obj=new AnnotationConfigApplicationContext(Cars.class);
		Maruti maruti=obj.getBean(Maruti.class);
		maruti.speed();
	    
		
	}

}
