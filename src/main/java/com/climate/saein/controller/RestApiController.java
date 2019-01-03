package com.climate.saein.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.climate.saein.dto.ContentsDto;
import com.climate.saein.service.ContentsService;

@RestController
@RequestMapping("/rest")
public class RestApiController {
	
	@Value("${api.contents.url}")
	private String url;
	
	@Value("${api.contents.clientid}")
	private String id;
	
	@Value("${api.contents.clientkey}")
	private String key;
	
	@Autowired
	ContentsService contentsService;
	
	@PostMapping("/search/contents")
	public ResponseEntity<ContentsDto> searchMain(@ModelAttribute ContentsDto dto) {

		contentsService.searchContents(dto, url, id, key);
		return new ResponseEntity<ContentsDto>(dto, HttpStatus.OK);
	}
}
