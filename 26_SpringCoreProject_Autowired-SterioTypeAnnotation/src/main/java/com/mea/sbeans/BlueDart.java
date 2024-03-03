package com.mea.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("blueDart")
@Lazy(true)
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
