package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/message")
	public List<String> getControllerMessage() {
		return List.of("Alice", "Bob", "Charlie","Sanjay");
	}

}
