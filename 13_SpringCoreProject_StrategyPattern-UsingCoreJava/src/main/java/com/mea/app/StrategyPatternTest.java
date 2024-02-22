package com.mea.app;

import com.mea.comps.Flipkart;
import com.mea.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {

		//get target class object from factory
		Flipkart flipkart = FlipkartFactory.getInstance("blueDart");
		String messagString = flipkart.shopping(new String[]{"candles","flowers","cake"},
				          new double[] {1000.0,2000.0,3000.0});
		
		System.out.println(messagString);
	}

}

/*BlueDart.BlueDart() :: 0-param-constructor
Flipkart.Flipkart() :: 0-param-constructor
Flipkart.setCourier()
Flipkart.shopping()
[candles, flowers, cake] are purchased having bill amount :6000.0---->51841 order id Order assigned to BlueDart
*/