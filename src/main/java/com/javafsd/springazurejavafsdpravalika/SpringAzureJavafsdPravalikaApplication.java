package com.javafsd.springazurejavafsdpravalika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureJavafsdPravalikaApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Congratulation!! Deployment successfullin Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureJavafsdPravalikaApplication.class, args);
	}

}
