package com.climate.saein.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.climate.saein.common.api.DustRestApi;

@Controller
public class GreetingController {
	
	DustRestApi api = new DustRestApi();

	@Value("${api.dust.key}") 
	private String key;
	
	@Value("${api.dust.region.url}")
	private String url;
	
	@GetMapping("/greeting")
	public String greeting() {
			try {
				api.restClimateClient("서울",url,key);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return "greeting";
	}
	
}
