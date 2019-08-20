package com.lnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Test12Application {

	@GetMapping("/")
	public String hello()
	{
		return "Hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(Test12Application.class, args);
	}

}
