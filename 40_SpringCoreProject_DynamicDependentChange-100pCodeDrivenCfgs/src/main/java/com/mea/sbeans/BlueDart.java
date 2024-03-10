package com.mea.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public final class BlueDart implements Courier {

	
	public BlueDart() {

		System.out.println("BlueDart.BlueDart() :: 0-param-constructor");
	}
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order id Order assigned to BlueDart";
	}

}
