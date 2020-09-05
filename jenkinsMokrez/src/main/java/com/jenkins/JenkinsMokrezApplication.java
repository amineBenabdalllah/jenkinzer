package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsMokrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMokrezApplication.class, args);
	}
	
	@GetMapping("/")
	public String test()
	{
		return "Hello world";
	}

}
