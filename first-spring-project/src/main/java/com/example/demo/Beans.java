package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	@Bean(name = "ciaoMondo")
	String name() {
		return "Ciao Mondo";
	}
}
