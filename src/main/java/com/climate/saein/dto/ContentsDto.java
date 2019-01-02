package com.climate.saein.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ContentsDto {

	private String startDate;
	private String endDate;
	private String timeUnit;
	private String[] keywordGroups;
	private String groupName;
	private String[] keywords;
}
