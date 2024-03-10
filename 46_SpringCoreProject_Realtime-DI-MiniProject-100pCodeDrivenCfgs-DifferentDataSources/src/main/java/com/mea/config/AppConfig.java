package com.mea.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ControllerConfig.class,PersistenceConfig.class,ServiceConfig.class})
public class AppConfig {

}
