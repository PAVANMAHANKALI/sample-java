package com.sample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class HomeController {
	

	@GetMapping("/index")
	public String index() {
	return "Welcome to Index Page";	
	}
	@GetMapping("/home")
	public String home() {
	return "welcome to Home Page";	
		
		
	}
	
}
