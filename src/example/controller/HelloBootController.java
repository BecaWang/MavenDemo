package example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {
	
	//http://localhost:8080/
	
	@RequestMapping("/")
	public String helloPage(){
		return "Hello! Spring Boot and maven";
	}
}
