package com.climate.saein.dto;

import lombok.Data;

@Data
public class KeywordDto {

	private String groupName;
	private String[] keywords;
	private String title;
	private String[] data;
	private String period;
	private String ratio;
	
	public void of(String groupName, String[] keywords) {
		this.groupName = groupName;
		this.keywords  = keywords;
	}
}
