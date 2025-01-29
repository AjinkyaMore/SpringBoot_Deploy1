package com.sd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping({"/", "/home", "/status"})
	public String hello()
	{
		return "Welcome to Spring Boot REST API ....";
	}
}
