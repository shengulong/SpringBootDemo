package com.dudu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Chapter1Application {
	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot";
	}

	@GetMapping("/about")
	public String about() {
		return "About the application";
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}
