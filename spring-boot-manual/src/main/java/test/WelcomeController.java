package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/")
	public String sayHello(){
		return "<h1> Welcome to Spring Boot </h1>"; 
	}

}
