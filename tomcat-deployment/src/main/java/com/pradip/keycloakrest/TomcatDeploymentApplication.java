package com.pradip.keycloakrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomcatDeploymentApplication {

	
	@GetMapping("/message")
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TomcatDeploymentApplication.class, args);
	}

}
