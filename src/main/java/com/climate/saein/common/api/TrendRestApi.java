package com.climate.saein.common.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Component;

import com.climate.saein.common.conf.APIType;

@Component
public class TrendRestApi {

	
	public void trendRestReq(String url,String id,String key) {
		
		try {
			
			URL apiURL = new URL(url);
            String body = "{\"startDate\":\"2017-01-01\",\"endDate\":\"2017-04-30\",\"timeUnit\":\"month\",\"keywordGroups\":[{\"groupName\":\"한글\",\"keywords\":[\"한글\",\"korean\"]},{\"groupName\":\"영어\",\"keywords\":[\"영어\",\"english\"]}],\"device\":\"pc\",\"ages\":[\"1\",\"2\"],\"gender\":\"f\"}";
			HttpsURLConnection con = (HttpsURLConnection)apiURL.openConnection();
			con.setRequestMethod(APIType.REQ_METHOD_POST.getValue());
			con.setRequestProperty(APIType.API_CONTENTS_ID.getValue(), id);
			con.setRequestProperty(APIType.API_CONTENTS_KEY.getValue(), key);
			con.setRequestProperty("Content-Type", APIType.TYPE_JSON.getValue());
			con.setDoOutput(true);
			
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(body);
			wr.flush();
			wr.close();
			
			int responseCode = con.getResponseCode();
			System.out.println("[API RETURN]: " + responseCode);
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));){
				br.lines().forEach(System.out::println);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
