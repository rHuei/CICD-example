package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

	@RequestMapping(value = "/", method = GET)
	public String index() {
		return "Welcome to Brobridge!";
	}

	@RequestMapping(value = "/demo", method = GET)
	public String demo() {
		return "Welcome to Tomcat World";
	}
}