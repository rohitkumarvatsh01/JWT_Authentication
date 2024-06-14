package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/security")
public class JwtController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome to Admin Page";
	}
	
	@GetMapping("/user")
	public String user(){
		return "Welcome to User Page";
	}
}

