package com.tns.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@SpringBootApplication
public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Body.class, args);
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Body.class);
      Human human=context.getBean(Human.class);
      human.startPump();
		
      }
	}