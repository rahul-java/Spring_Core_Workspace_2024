package com.mea.service;

import com.mea.bo.CustomerBO;
import com.mea.dao.ICustomerDAO;
import com.mea.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {

		System.out.println("CustomerMgmtServiceImpl ::: 1-param-constructor");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
		
		//calculate interest amount
		double intramt=(dto.getPamt()*dto.getRate())/100.0;
		
		//prepare CustomerBO class obj having persistable data
		CustomerBO customerBO =new CustomerBO();
		customerBO.setCname(dto.getCname());
		customerBO.setCadd(dto.getCadd());
		customerBO.setPamt(dto.getPamt());
		customerBO.setIntramt(intramt);
		
		//use DAO
		int count=dao.insert(customerBO);
		
		//process the result
		return count==0?"Registration Failed":"Registration Successfully . Interest Amount : "+intramt;
	}

}
