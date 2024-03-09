package com.mea.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.beans.Cricketer;

public class AwareInjectionWithDependencyLookupTest {
	
	public static void main(String[] args) {
		
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
		
		//get target class obj
		Cricketer cricketer = ctx.getBean("cricketer",Cricketer.class);
		
		cricketer.batting();
		cricketer.bowling();
		cricketer.fielding();
		cricketer.wicketKeeping();
		
		//close the container
		ctx.close();
		
	}
}

/*

CricketBat.CricketBat() :: 0-param-constructor
Cricketer.Cricketer() :: 0-param-constructor
Cricketer.setApplicationContext()
Cricketer.batting()
Virat Kohli with 18 is batting and Scored 30 runs
Virat Kohli with 18 is bowling.
Virat Kohli with 18 is fielding.
Virat Kohli with 18 is wicketKeeping.

*/