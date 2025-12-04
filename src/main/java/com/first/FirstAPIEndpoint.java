package com.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPIEndpoint {

	@GetMapping({ "/", "/hello" })
	public String HelloWorlAPI() {
		return "Hello World from AKYADAV's First SpringBoot Project....";
	}
	
	//Open the browser and open the "http://localhost:8080/" or "http://localhost:8080/hello"

}
