package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsDemoApplication {

	public static void main(String[] args) {
		// Jvm start
		// Spring scans the project
		// Embedded Tomcat starts
		// HTTP server listens on port 8080
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
