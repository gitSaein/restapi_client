package com.climate.saein.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.climate.saein.common.api.TrendRestApi;
import com.climate.saein.dto.ContentsDto;
import com.climate.saein.service.ContentsService;

@Service
public class ContentsServiceImpl implements ContentsService{
	
	@Autowired
	TrendRestApi tApi;
	
	@Override
	public List<ContentsDto> searchContents(ContentsDto dto ,String url,String id, String key) {
		tApi.trendRestReq(url, id, key);
		return null;
	}

}
