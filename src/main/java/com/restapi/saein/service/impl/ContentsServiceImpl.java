package com.restapi.saein.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.restapi.saein.common.api.TrendRestApi;
import com.restapi.saein.dto.ContentsDto;
import com.restapi.saein.dto.KeywordDto;
import com.restapi.saein.service.ContentsService;

@Service
public class ContentsServiceImpl implements ContentsService{
	
	@Autowired
	TrendRestApi tApi;
	
	@Override
	public ContentsDto searchContents(ContentsDto dto ,String url,String id, String key) {
		Gson gson = new Gson();
		List<KeywordDto> listKeyGroup = new ArrayList<KeywordDto>();
		KeywordDto inDto  = new KeywordDto();

		dto.setArrKeywords(dto.getKeyword());
		inDto.setGroupName(dto.getGroupName());
		inDto.setKeywords(dto.getKeywords());
		listKeyGroup.add(inDto);
		dto.setKeywordGroups(listKeyGroup);
		dto.setGroup(listKeyGroup);
		return tApi.trendRestReq(url, id, key, gson.toJson(dto));
	}

}
