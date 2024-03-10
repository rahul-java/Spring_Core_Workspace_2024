package com.mea.dao;

import com.mea.bo.CustomerBO;

public interface ICustomerDAO {

	public int insert(CustomerBO customerBO) throws Exception;
}
