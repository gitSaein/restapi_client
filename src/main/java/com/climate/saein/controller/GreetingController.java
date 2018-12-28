package com.climate.saein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.climate.saein.common.api.RESTApi;

@Controller
public class GreetingController {
	
	RESTApi api = new RESTApi();

	@GetMapping("/greeting")
	public String greeting() {
			try {
				api.restClimateClient("¼­¿ï");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "greeting";
	}
	
}
