package com.climate.saein.common.api;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;
import org.springframework.beans.factory.annotation.Value;
import com.climate.saein.common.type.APIType;

public class DustRestApi {

	@Value("${key.api.dust}") 
	String key;
	
	public String restClimateClient(String city) throws Exception{
		
		EncryptExe enc = new EncryptExe();
		String serviceKey = URLEncoder.encode(key,"UTF-8");
		String parameter = enc.returnEncParamter(serviceKey, "sidoName="+city+"&pageNo=1&numOfRows=10&ver=1.3");
		String addr
		= APIType.REGION_REAL_API.getValue() + "?ServiceKey=" + serviceKey + parameter;
		
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
