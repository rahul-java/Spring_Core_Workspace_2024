package com.mea.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/mea/commons/info.properties")
public class Cricketer implements ApplicationContextAware{

	@Value("${crktr.name}")
	private String name;

	@Value("${crktr.jersyNo}")
	private int jersyNo;
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
		
	}
	
	
	public Cricketer() {

		System.out.println("Cricketer.Cricketer() :: 0-param-constructor");
	}

	public void fielding() {

		System.out.println(name + " with " + jersyNo + " is fielding.");
	}

	public void batting() {

		System.out.println("Cricketer.batting()");
		
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
