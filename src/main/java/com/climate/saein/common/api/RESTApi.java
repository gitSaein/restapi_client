package com.climate.saein.common.api;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;

import com.climate.saein.common.conf.Type;

public class RESTApi {

	public String restClimateClient(String city) throws Exception{
		String serviceKey = URLEncoder.encode(Type.SERVICE_KEY.getValue(),"UTF-8");
		String addr
		= Type.REGION_REAL_API.getValue() + "?sidoName="+city+"&pageNo=1&numOfRows=10&ServiceKey=" + serviceKey + "&ver=1.3";
		String data;
		URL url = new URL(addr);
		InputStream in = url.openStream();
		CachedOutputStream cos = new CachedOutputStream();
		IOUtils.copy(in, cos);
		in.close();
		cos.close();
		data = cos.getOut().toString();
		System.out.println("DATAs::" + cos.getOut().toString());
		return data;
	}
}
