package com.restapi.saein.common.conf;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.restapi.saein.common.filter.MainFilter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.restapi.saein.*"})
@PropertySource("classpath:config-dev.properties")
public class MVCConfig implements WebMvcConfigurer {

	private @Autowired AutowireCapableBeanFactory beanFactory;
/*	@Bean
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
		.addResourceLocations("classpath:/");
	}
	*/
	@Bean
	public ViewResolver  templateResolver() {
		InternalResourceViewResolver  re = new InternalResourceViewResolver();
	    re.setPrefix("/WEB-INF/view/");
	    re.setSuffix(".jsp");
	    return re;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
		pspc.setIgnoreUnresolvablePlaceholders(true);
		return pspc;
		
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public FilterRegistrationBean<Filter> MainFilter() {
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<Filter>();
		Filter mainFilter = new MainFilter();
		beanFactory.autowireBean(mainFilter);
		registration.setFilter(mainFilter);
		registration.addUrlPatterns("/*");
		return registration;
	}
	
}
