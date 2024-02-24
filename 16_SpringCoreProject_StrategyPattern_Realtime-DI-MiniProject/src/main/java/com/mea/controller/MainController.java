package com.mea.controller;

import com.mea.dto.CustomerDTO;
import com.mea.service.ICustomerMgmtService;
import com.mea.vo.CustomerVO;

public final class MainController {

	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {

		System.out.println("MainController ::: 1-param-constructor");
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception
	{
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCname(vo.getCname());
		customerDTO.setCadd(vo.getCadd());
		customerDTO.setPamt(Double.parseDouble(vo.getPamt()));
		customerDTO.setTime(Double.parseDouble(vo.getTime()));
		customerDTO.setRate(Double.parseDouble(vo.getRate()));
		
		//use Service
		String resultMsg=service.registerCustomer(customerDTO);
		return resultMsg;
	}
	
	
}
