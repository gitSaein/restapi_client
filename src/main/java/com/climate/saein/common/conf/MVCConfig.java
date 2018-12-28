package com.climate.saein.common.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.climate.saein.controller"})
public class MVCConfig implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver  templateResolver() {
		InternalResourceViewResolver  re = new InternalResourceViewResolver();
	    re.setPrefix("/WEB-INF/view/");
	    re.setSuffix(".jsp");
	    return re;
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	
	
	
	
}
