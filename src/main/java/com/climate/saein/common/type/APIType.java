package com.climate.saein.common.type;

public enum APIType {

	REGION_REAL_API("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnMesureSidoLIst"),
	TIME_REAL_API("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMinuDustFrcstDspth");
	
	private String value;
	private APIType(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
}
