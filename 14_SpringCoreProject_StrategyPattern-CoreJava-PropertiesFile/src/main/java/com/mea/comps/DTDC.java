package com.mea.comps;

public final class DTDC implements Courier {

	
	public DTDC() {

		System.out.println("DTDC.DTDC() :: 0-param-constructor");
	}
	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order id Order assigned to DTDC";
	}

}
