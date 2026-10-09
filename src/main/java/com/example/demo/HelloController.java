package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/number")
	public int number() {
		return 67;
	}
}