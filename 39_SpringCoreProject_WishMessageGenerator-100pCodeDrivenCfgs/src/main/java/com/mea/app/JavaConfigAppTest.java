package com.mea.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mea.cfgs.AppConfig;
import com.mea.sbeans.WishMessageGenerator;

public class JavaConfigAppTest 
{
    public static void main( String[] args )
    {
        //create IOC container
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//get target spring bean class obj
    	WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
    	
    	String message = generator.generateWishMessage("Raja");
    	System.out.println(message);
    	
    	//close container
    	ctx.close();
    }
}

/*
 AppConfig.AppConfig() :: 0-param-constructor
WishMessageGenerator.WishMessageGenerator() :: 0-param-constructor
AppConfig.createLocalDateTime()
Good Afternoon :: Raja

*/
