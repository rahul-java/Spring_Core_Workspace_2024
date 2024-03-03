package com.mea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mea.bo.CustomerBO;
import com.mea.dao.ICustomerDAO;
import com.mea.dto.CustomerDTO;

@Service("custService")
//@Component("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	@Qualifier("dao")
	private ICustomerDAO dao;
	

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
