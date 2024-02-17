package com.mea.app;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instantiation {

	public static void main(String[] args) {

		try {
			//load the class at runtime
			Class c=Class.forName(args[0]);
			
			//create obj dynamically - Option:1
			Object obj=c.newInstance();
			
			System.out.println("Obj1 ::: "+obj.toString());
			
			System.out.println("----------------------------------");
			
			Constructor cons[]=c.getDeclaredConstructors();
			
			Object obj2=cons[0].newInstance();
			System.out.println("Obj2 ::: "+obj2.toString());
			System.out.println("------------------------------------------");
			Object obj3=cons[1].newInstance(10,20);
			System.out.println("Obj3 ::: "+obj3.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
