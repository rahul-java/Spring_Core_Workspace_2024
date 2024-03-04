package com.mea.app;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest 
{
    public static void main( String[] args )
    {
    	//create IOC container
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mea/cfgs/applicationContext.xml");
    	
    	//get msg from properties file according to the Locale we submit
    	Locale locale = new Locale(args[0],args[1]);
    	String msg1=ctx.getMessage("wish.msg", new String[] {},locale);
    	String msg2=ctx.getMessage("bye.msg", new String[] {},locale);
    	
    	//print the msg
    	System.out.println(msg1+" , "+msg2);
   
    }
}
