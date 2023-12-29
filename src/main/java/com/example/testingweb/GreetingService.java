package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hola, soy José Rolando Zumba Gómez";
	}
public String greet1(String query) {
		return "Iyección código" + query;
	}
}
