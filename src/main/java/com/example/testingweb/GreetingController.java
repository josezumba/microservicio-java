package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

	@RequestMapping("/greeting1")
	public @ResponseBody String greeting1(@RequestParam(value = "name", defaultValue = "World") String name) {
		String query = "SELECT * FROM users WHERE username = '" + name + "'";
		return service.greet(query);
	}

}
