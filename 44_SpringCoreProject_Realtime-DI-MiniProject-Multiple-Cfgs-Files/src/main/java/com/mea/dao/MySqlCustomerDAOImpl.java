package com.mea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mea.bo.CustomerBO;

public class MySqlCustomerDAOImpl implements ICustomerDAO {

	private DataSource ds;

	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIME_DI_CUSTOMER(NAME,ADDRESS,PAMT,INTRAMT) VALUES(?,?,?,?)";

	public MySqlCustomerDAOImpl(DataSource ds) {

		System.out.println("MySqlCustomerDAOImpl ::: 1-param-constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO customerBO) throws Exception {

		System.out.println("MySqlCustomerDAOImpl.insert()");

		int count = 0;

		// get pooled jdbc connection
		try (Connection connection = ds.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(CUSTOMER_INSERT_QUERY);) {

			if (preparedStatement != null) {
				preparedStatement.setString(1, customerBO.getCname());
				preparedStatement.setString(2, customerBO.getCadd());
				preparedStatement.setDouble(3, customerBO.getPamt());
				preparedStatement.setDouble(4, customerBO.getIntramt());

				// execute query
				count = preparedStatement.executeUpdate();
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
			throw sql;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

}
