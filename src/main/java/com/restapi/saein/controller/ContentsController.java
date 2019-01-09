package com.restapi.saein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restapi.saein.common.api.TrendRestApi;

@Controller
public class ContentsController {

	@Value("${api.contents.url}")
	private String url;
	
	@Value("${api.contents.clientid}")
	private String id;
	
	@Value("${api.contents.clientkey}")
	private String key;
	
	@Autowired
	TrendRestApi tApi;
	
	@RequestMapping("/contents")
	public String mainContents(String str){
		return "contnetsSearch";
	}
}
