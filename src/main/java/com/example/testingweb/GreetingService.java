package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hello, World";
	}
	public String greet1(String query) {
		return "Iyección código" + query;
	}
}
