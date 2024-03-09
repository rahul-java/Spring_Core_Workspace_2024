package com.mea.beans;

import java.sql.BatchUpdateException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/mea/commons/info.properties")
public class Cricketer {

	@Value("${crktr.name}")
	private String name;

	@Value("${crktr.jersyNo}")
	private int jersyNo;
	
	public Cricketer() {

		System.out.println("Cricketer.Cricketer() :: 0-param-constructor");
	}

	public void fielding() {

		System.out.println(name + " with " + jersyNo + " is fielding.");
	}

	public void batting() {

		//create an extra IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
		
		//perform dependency lookup to get Bat object (Dependent class obj)
		
		//CricketBat bat = ctx.getBean("bat",CricketBat.class);  //lookup with dependent bean id
		
		CricketBat bat = ctx.getBean(CricketBat.class);  //lookup with dependent class name
		
		//invoke the b.method
		int scoreRuns = bat.scoreRuns();
		
		System.out.println(name + " with " + jersyNo + " is batting and Scored "+scoreRuns+" runs");
	}

	public void bowling() {

		System.out.println(name + " with " + jersyNo + " is bowling.");
	}
	
	public void wicketKeeping() {

		System.out.println(name + " with " + jersyNo + " is wicketKeeping.");
	}
	

}
