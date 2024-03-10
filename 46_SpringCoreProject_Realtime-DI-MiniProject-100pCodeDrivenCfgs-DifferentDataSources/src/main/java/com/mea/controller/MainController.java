package com.mea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.mea.dto.CustomerDTO;
import com.mea.service.ICustomerMgmtService;
import com.mea.vo.CustomerVO;

@Controller("controller")
public final class MainController {

	//HAS-A property
	@Autowired
	private ICustomerMgmtService service;

	
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
