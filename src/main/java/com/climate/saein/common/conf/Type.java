package com.climate.saein.common.conf;

public enum Type {

	REGION_REAL_API("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty"),
	TIME_REAL_API("http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getMinuDustFrcstDspth"),
	SERVICE_KEY("BamKhG1WjbfEyhFppOaOMIuyHa6bb9mW7QqiYZZTIzRyNkdgAU527r1wXZZ9d6k4%2BsVDPaCYcUDpcG%2BhcbzjUg%3D%3D");
	
	private String value;
	private Type(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
}
