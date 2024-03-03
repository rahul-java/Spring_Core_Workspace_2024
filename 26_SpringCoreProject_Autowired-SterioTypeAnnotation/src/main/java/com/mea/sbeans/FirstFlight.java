package com.mea.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fFlight")
@Primary
public final class FirstFlight implements Courier {

	
	public FirstFlight() {

		System.out.println("FirstFlight.FirstFlight() :: 0-param-constructor");
	}
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order id Order assigned to FirstFlight";
	}

}
