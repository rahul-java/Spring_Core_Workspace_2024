package com.mea.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/mea/commons/info.properties")
public abstract class Cricketer {

	@Value("${crktr.name}")
	private String name;

	@Value("${crktr.jersyNo}")
	private int jersyNo;
	
	//@Autowired
	private ApplicationContext ctx;
	
	
	public Cricketer() {

		System.out.println("Cricketer.Cricketer() :: 0-param-constructor");
	}

	public void fielding() {

		System.out.println(name + " with " + jersyNo + " is fielding.");
	}

	public void batting() {

		System.out.println("Cricketer.batting()");
		
		//get dependent class object
		CricketBat bat = getCricketBat();
		
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

	
	@Lookup
	public abstract CricketBat getCricketBat();  //this method will be implemented in the Inmemory proxy class obj ref, subClass of target class
	

}
