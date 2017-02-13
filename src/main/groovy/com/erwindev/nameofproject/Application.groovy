package com.erwindev.nameofproject

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired

@Configuration
@ComponentScan
@EnableAutoConfiguration
class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args)
	}
}
