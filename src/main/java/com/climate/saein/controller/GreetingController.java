package com.climate.saein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.climate.saein.common.api.DustRestApi;

@Controller
public class GreetingController {
	
	DustRestApi api = new DustRestApi();

	@GetMapping("/greeting")
	public String greeting() {
			try {
				api.restClimateClient("����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "greeting";
	}
	
}
