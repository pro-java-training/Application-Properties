package com.codve.ApplicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.codve.controller", "com.codve.Bean"})
public class ApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPropertiesApplication.class, args);
	}




}
