package com.jokesappnew;

import com.jokesappnew.controller.JokeGenerator;
import com.jokesappnew.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class JokesappnewApplication {


	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JokesappnewApplication.class, args);
	//	System.out.println(((JokeService)context.getBean("JokeService")).getMeJoke());
	//	((JokeGenerator)context.getBean("jokeGenerator")).test();
	}

}
