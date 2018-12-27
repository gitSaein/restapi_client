package com.climate.saein.common.api;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

import com.climate.saein.common.conf.Type;

public class ClimateRESTAPI {

	private String restClient(String city) throws Exception{
		String serviceKey = URLEncoder.encode(Type.SERVICE_KEY.getValue(),"UTF-8");
		String addr
		= Type.REGION_REAL_API.getValue() + "?sidoName="+city+"&pageNo=1&numOfRows=10&ServiceKey=" + serviceKey + "&ver=1.3";
		
		URL url = new URL(addr);
		InputStream in = url.openStream();
		
		return addr;
	}
}
