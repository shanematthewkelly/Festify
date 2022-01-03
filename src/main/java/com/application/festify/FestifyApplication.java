package com.application.festify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FestifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FestifyApplication.class, args);
		System.out.println("Festify App");
	}
}
