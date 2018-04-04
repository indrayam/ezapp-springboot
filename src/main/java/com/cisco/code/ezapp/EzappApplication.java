package com.cisco.code.ezapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
// Adding a comment for the sake of testing
public class EzappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzappApplication.class, args);
	}
}
