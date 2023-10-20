package com.example.apiREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// This annotation is needed to avoid the error: "No qualifying bean of type 'org.springframework.web.servlet.config.annotation.WebMvcConfigurer' available"

public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}
