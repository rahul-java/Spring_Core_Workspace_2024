package com.mea.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.mea.dao")
@PropertySource(value = "com/mea/commons/database.properties")
public class PersistenceConfig {

	@Autowired
	private Environment environment;
	
	/*
	@Bean(name = "dmds")
	public DriverManagerDataSource createDriverManagerDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
		dmds.setUrl(environment.getRequiredProperty("jdbc.url"));
		dmds.setUsername(environment.getRequiredProperty("jdbc.username"));
		dmds.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dmds;
	}
	*/
	
	
	@Bean(name="dbcp2DS")
	public  DataSource   createApacheDBCP2DS() {
		System.out.println("PersistenceConfig.createApacheDBCP2DS()");
		
		   BasicDataSource   bds=new BasicDataSource();
		   bds.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
		   bds.setUrl(environment.getRequiredProperty("jdbc.url"));
		   bds.setUsername(environment.getRequiredProperty("jdbc.username"));
		   bds.setPassword(environment.getRequiredProperty("jdbc.password"));
		   bds.setMinIdle(10);  // initial con objs in the jdbc con pool
		   bds.setMaxTotal(100);  // max con objs in the jdbc con pool
		   bds.setMaxWaitMillis(30000);  // max wait time in millis  to get avail the jdbc con object
		   return bds;
	}
	
	/*
	@Bean(name="hkcpDS")
	public  DataSource   createHKCPDS() {
		
		System.out.println("PersistenceConfig.createHKCPDS()");
		
		 HikariDataSource  hkDs=new HikariDataSource();
		 hkDs.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
		 hkDs.setJdbcUrl(environment.getRequiredProperty("jdbc.url"));
		 hkDs.setUsername(environment.getRequiredProperty("jdbc.username"));
		 hkDs.setPassword(environment.getRequiredProperty("jdbc.password"));
		 hkDs.setMinimumIdle(10);
		 hkDs.setMaximumPoolSize(100);
		 hkDs.setConnectionTimeout(30000);
		 return hkDs;
	}
	*/
}
