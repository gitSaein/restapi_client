package com.restapi.saein.service;

import com.restapi.saein.dto.ContentsDto;

public interface ContentsService {

	ContentsDto searchContents(ContentsDto dto, String url, String id, String key);
}
