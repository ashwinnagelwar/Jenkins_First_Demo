package com.bikkadIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsFirstDemoApplication.class, args);
		
		
		System.out.println("First Jenkins Integration test");
		System.out.println("First Build Pipeline Trial");
	}

}
