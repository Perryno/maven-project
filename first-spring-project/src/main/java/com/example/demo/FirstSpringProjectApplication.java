package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
		String message = context.getBean("ciaoMondo", String.class);
		log.info(message);
	}

}
