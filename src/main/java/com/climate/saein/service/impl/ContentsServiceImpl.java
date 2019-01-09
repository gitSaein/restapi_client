package com.climate.saein.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.climate.saein.common.api.TrendRestApi;
import com.climate.saein.dto.ContentsDto;
import com.climate.saein.dto.KeywordDto;
import com.climate.saein.service.ContentsService;
import com.google.gson.Gson;

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
