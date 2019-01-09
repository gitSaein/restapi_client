package com.restapi.saein.common.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.*;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.restapi.saein.common.conf.APIType;
import com.restapi.saein.dto.ContentsDto;

@Component
public class TrendRestApi {

	private static Logger log = Logger.getLogger(TrendRestApi.class);
	
	public ContentsDto trendRestReq(String url,String id,String key, String bodyData) {
		
		ContentsDto dto = new ContentsDto();
		try {
			URL apiURL = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection)apiURL.openConnection();
			con.setRequestMethod(APIType.REQ_METHOD_POST.getValue());
			con.setRequestProperty(APIType.API_CONTENTS_ID.getValue(), id);
			con.setRequestProperty(APIType.API_CONTENTS_KEY.getValue(), key);
			con.setRequestProperty("Content-Type", APIType.CONTENT_TYPE.getValue());
			con.setDoOutput(true);
			
			try(DataOutputStream wr = new DataOutputStream(con.getOutputStream());){
			   wr.writeBytes(bodyData);
			   log.info("[API RETURN]: " + con.getResponseCode());
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));){
				dto = this.jsonToDto(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dto; 
	}
	
	ContentsDto jsonToDto(String json) {
		Gson gson = new Gson();
		ContentsDto dto =  gson.fromJson(json, ContentsDto.class);
		return dto;
	}
}
