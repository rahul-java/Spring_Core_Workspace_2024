package com.mea.service;

import com.mea.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public String registerCustomer(CustomerDTO dto) throws Exception;
}
