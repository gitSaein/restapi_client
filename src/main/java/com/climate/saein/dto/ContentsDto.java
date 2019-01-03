package com.climate.saein.dto;

import java.util.List;

import org.apache.cxf.common.util.StringUtils;

import lombok.Data;

@Data
public class ContentsDto {
	
	private String startDate;
	private String endDate;
	private String timeUnit;
	private List<KeywordDto> keywordGroups;
	private String groupName;
	private String keyword;
	private String[] keywords;
	
	public void setArrKeywords(String keyword) {
		this.keywords = StringUtils.split(keyword,",");
	}
	
	public void setGroup(List<KeywordDto> keywordGroups) {
		this.keywordGroups = keywordGroups;
	}
	
}
