package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import javax.servlet.http.HttpServletResponse;


@RestController
public class HelloController {

	@Value("${application.version}")
	private String appVersion;

	@RequestMapping(value = "/", method = GET)
	public String index(HttpServletResponse response) {
		//String appVersion = System.getenv("APP_VERSION");
		response.addHeader("Application-Version", appVersion);
		return "Welcome to Brobridge!";
	}

	@RequestMapping(value = "/demo", method = GET)
	public String demo() {
		return "Welcome to Tomcat World";
	}
}
