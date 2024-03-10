package com.mea.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.mea.service")
@ImportResource(locations = "com/mea/config/applicationContext.xml")
@PropertySource(value = "com/mea/commons/database.properties")
public class ServiceConfig {

}
