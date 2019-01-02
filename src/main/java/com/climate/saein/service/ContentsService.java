package com.climate.saein.service;

import java.util.List;

import com.climate.saein.dto.ContentsDto;

public interface ContentsService {

	List<ContentsDto> searchContents(ContentsDto dto, String url, String id, String key);
}
