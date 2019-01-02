package com.climate.saein.common.conf;

public enum APIType {

	REQ_METHOD_POST("POST"),
	API_CONTENTS_ID("X-Naver-Client-Id"),
	API_CONTENTS_KEY("X-Naver-Client-Secret"),
	TYPE_JSON("application/json")
	;
	
	private String value;
	
	APIType(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
