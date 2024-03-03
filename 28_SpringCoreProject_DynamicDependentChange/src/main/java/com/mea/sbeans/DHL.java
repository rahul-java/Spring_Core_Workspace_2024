package com.mea.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dhl")
//@Lazy(true)
@Scope("prototype")
public final class DHL implements Courier {

	
	public DHL() {

		System.out.println("DHL.DHL() :: 0-param-constructor");
	}
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order id Order assigned to DHL";
	}

}
