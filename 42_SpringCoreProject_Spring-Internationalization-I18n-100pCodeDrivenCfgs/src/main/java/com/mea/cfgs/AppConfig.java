package com.mea.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

	@Bean(name = "messageSource")
	public ResourceBundleMessageSource createResourceBundleMessageSource() {
		System.out.println("AppConfig.createResourceBundleMessageSource()");
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/mea/commons/App");
		return source;
	}
}
