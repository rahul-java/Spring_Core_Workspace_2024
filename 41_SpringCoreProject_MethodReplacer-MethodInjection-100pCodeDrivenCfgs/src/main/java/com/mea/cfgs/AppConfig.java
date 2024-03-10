package com.mea.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.mea")
@ImportResource(locations = "com/mea/cfgs/applicationContext.xml")
public class AppConfig {

}
