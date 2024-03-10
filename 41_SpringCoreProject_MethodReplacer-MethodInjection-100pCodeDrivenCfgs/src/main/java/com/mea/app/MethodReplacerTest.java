package com.mea.app;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mea.cfgs.AppConfig;
import com.mea.service.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {

		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get Target class obj ref
		BankService service = ctx.getBean("bankService", BankService.class);
		System.out.println(service.getClass() + "   " + service.getClass().getSuperclass() + " "
				+ Arrays.toString(service.getClass().getDeclaredMethods()));

		// invoke the b.method
		double IntrAmt = service.calcInterestAmount(100000, 12, 2);
		System.out.println("Intrest Amount  is ::" + IntrAmt);

		// close the container
		ctx.close();

	}
}

/*
 * 
 * CricketBat.CricketBat() :: 0-param-constructor Cricketer.Cricketer() ::
 * 0-param-constructor class
 * com.mea.beans.Cricketer$$EnhancerBySpringCGLIB$$c6555944 :: class
 * com.mea.beans.Cricketer Cricketer.batting() Virat Kohli with 18 is batting
 * and Scored 105 runs Virat Kohli with 18 is bowling. Virat Kohli with 18 is
 * fielding. Virat Kohli with 18 is wicketKeeping.
 * 
 */