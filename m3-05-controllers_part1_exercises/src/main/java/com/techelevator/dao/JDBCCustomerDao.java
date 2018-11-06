package com.techelevator.dao;

import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		
		String sql = "select first_name, last_name, email, activebool from customer where first_name = ? OR last_name = ?"
				+ " order by ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, search, search, sort);
		List<Customer> customerList = new ArrayList<Customer>();
		while (result.next()) {
			
			Customer customer = mapRowToCustomer(result);
			customerList.add(customer);
		}
		return customerList;
	}

	private Customer mapRowToCustomer(SqlRowSet result) {
		Customer customer= new Customer();
		customer.setFirstName(result.getString("first_name"));
		customer.setLastName(result.getString("last_name"));
		customer.setEmail(result.getString("email"));
		customer.setActive(result.getBoolean("activebool"));
		return customer;
	}

    
    
}