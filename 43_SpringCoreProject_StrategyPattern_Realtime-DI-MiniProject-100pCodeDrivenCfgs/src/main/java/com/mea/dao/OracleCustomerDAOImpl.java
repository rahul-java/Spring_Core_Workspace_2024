package com.mea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mea.bo.CustomerBO;

@Repository("oracleDAO")
public class OracleCustomerDAOImpl implements ICustomerDAO {

	@Autowired
	private DataSource ds;
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO REALTIME_DI_CUSTOMER VALUES(CNO_SEQ.NEXTVAL,?,?,?,?)";

	@Override
	public int insert(CustomerBO customerBO) throws Exception {

		System.out.println("Oracle-CustomerDAOImpl.insert()");

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
