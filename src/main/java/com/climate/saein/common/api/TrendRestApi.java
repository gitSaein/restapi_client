package com.climate.saein.common.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.*;
import org.springframework.stereotype.Component;

import com.climate.saein.common.conf.APIType;
import com.climate.saein.dto.ContentsDto;
import com.google.gson.Gson;

@Component
public class TrendRestApi {

	private static Logger log = Logger.getLogger(TrendRestApi.class);
	
	public String trendRestReq(String url,String id,String key, String bodyData) {
		
		try {
			String result;
			URL apiURL = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection)apiURL.openConnection();
			con.setRequestMethod(APIType.REQ_METHOD_POST.getValue());
			con.setRequestProperty(APIType.API_CONTENTS_ID.getValue(), id);
			con.setRequestProperty(APIType.API_CONTENTS_KEY.getValue(), key);
			con.setRequestProperty("Content-Type", APIType.TYPE_JSON.getValue());
			con.setDoOutput(true);
			
			try(DataOutputStream wr = new DataOutputStream(con.getOutputStream());){
			wr.writeBytes(bodyData);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("[API RETURN]: " + con.getResponseCode());
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));){
				result = br.readLine();
				System.out.println("[API RETURN VALUE] " + result);
				this.jsonToDto(result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "responseCode"; 
	}
	
	ContentsDto jsonToDto(String json) {
		Gson gson = new Gson();
		ContentsDto dto =  gson.fromJson(json, ContentsDto.class);
		return dto;
	}
}
