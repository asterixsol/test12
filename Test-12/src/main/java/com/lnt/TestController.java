package com.lnt;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	@GetMapping("/")
	public String hello()
	{
		return "Hello World";
	}
}
