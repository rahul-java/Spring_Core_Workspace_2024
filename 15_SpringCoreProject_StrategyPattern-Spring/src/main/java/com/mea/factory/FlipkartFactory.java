package com.mea.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.mea.comps.Courier;
import com.mea.comps.Flipkart;

//Factory Pattern
public class FlipkartFactory {

	private static Properties properties;

	static {

		try {
			// locate properties file through stream
			InputStream is = new FileInputStream("src/main/java/com/mea/commons/info.properties");

			// load properties file content to java.util.Properties class obj.
			properties = new Properties();
			properties.load(is);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// static factory method
	public static Flipkart getInstance() throws Exception {

		//get dependent class name
		String courierClassName = properties.getProperty("courier.classname");
		
		//load the dependent class
		Class className = Class.forName(courierClassName);
		
		//create object for loaded class
		Constructor<Courier> constructor[]=className.getDeclaredConstructors();
		//Courier courier = (Courier)constructor[0].newInstance();
		Courier courier = constructor[0].newInstance();
		
		// create target class obj
		Flipkart flipkart = new Flipkart();

		// assign dependent class obj to target class obj
		flipkart.setCourier(courier);

		return flipkart;
	}
}
