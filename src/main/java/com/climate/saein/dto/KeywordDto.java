package com.climate.saein.dto;

import lombok.Data;

@Data
public class KeywordDto {

	private String groupName;
	private String[] keywords;
	
	public void of(String groupName, String[] keywords) {
		this.groupName = groupName;
		this.keywords  = keywords;
	}
}
