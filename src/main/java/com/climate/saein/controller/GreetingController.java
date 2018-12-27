package com.climate.saein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting() {
		return "greeting";
	}
	
}
