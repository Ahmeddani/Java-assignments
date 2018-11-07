package com.techelevator.projects.model.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;

public class JDBCDepartmentDAOIntegrationTest {

	// Variable for DataSource
	private static SingleConnectionDataSource dataSource;
	
	// Variable JdbcDepartmentDAO
	private JDBCDepartmentDAO departmentDAO;
	
	
	// Before Class
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		/* The following line disables autocommit for connections 
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);
	}
	
	// After Class
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	
	
	// Before
	@Before
	public void setup() {
		departmentDAO = new JDBCDepartmentDAO(dataSource);
	}
	
	
	// After
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void get_all_departments() {
		// Insert Department -- ARRANGE
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String insertSql = "INSERT INTO department (name) VALUES ('test')";
		jdbcTemplate.update(insertSql);
		
		// Get all departments - ACT (TEST)
		List<Department> departments = departmentDAO.getAllDepartments();
		
		// Verify we have at least 1 department - ASSERT (VERIFY)
		Assert.assertTrue(departments.size() > 0);
	}
	
	
}
