package com.paymentsApp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestSpringApp {
	
	@GetMapping("/testMethod")
	public String testMethod() {
		System.out.println("This is a controller test page");
		return "test";
	}
}
