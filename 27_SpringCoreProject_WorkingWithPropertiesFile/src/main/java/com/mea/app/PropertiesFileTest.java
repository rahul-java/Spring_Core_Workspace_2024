package com.mea.app;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import com.mea.sbeans.Employee;


public class PropertiesFileTest {

	public static void main(String[] args) {

		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
		
		// get spring bean class obj 
				Employee emp=ctx.getBean("emp",Employee.class);
				//display  spring bean class obj data
				System.out.println("emp data::"+emp);
				
				Environment env=ctx.getEnvironment();
				System.out.println(env.getProperty("emp.id"));
				System.out.println("_____________________");
				System.out.println(System.getProperties());
				System.out.println("-----------------------");
				Date  date=ctx.getBean("dt",Date.class);
				System.out.println(date);
				
				
				//close the  container
				ctx.close();
		
	}

}
