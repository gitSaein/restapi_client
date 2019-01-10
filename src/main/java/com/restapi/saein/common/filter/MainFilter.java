package com.restapi.saein.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * ** Servlet Filter
 * -인증
 * -로깅 및 감사
 * -이미지 변환
 * -데이터 압축
 * -암호화 필터
 * -토크 나이징 
 * -xml 컨텐츠를 변형하는 xslt 필터
 * -MIME-Type 체인 필터
 * -URL 및 기타 정보들을 캐시하는 필터
 * 
 */
@Component
public class MainFilter implements Filter{

	private static final Logger logger = LoggerFactory.getLogger(MainFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//서블릿 컨테이너가 필터 인스턴스 초기화
		logger.info("MainFilter init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//필터 로직 
		logger.info("MainFilter doFilter");
		
	}

	@Override
	public void destroy() {
		//필터 인스턴스를 종료시키기 전에 호출
		logger.info("MainFilter destroy");
		
	}

}
