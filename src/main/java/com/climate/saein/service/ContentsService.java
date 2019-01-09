package com.climate.saein.service;

import com.climate.saein.dto.ContentsDto;

public interface ContentsService {

	ContentsDto searchContents(ContentsDto dto, String url, String id, String key);
}
