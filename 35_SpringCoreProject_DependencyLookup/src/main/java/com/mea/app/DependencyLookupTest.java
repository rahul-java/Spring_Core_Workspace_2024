package com.mea.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mea.beans.Cricketer;

public class DependencyLookupTest {
	
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
