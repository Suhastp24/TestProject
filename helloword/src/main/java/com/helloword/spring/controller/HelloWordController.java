package com.helloword.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@GetMapping("/hello-word")
	public String hello() {
		return "Hello Word";
	}

}
