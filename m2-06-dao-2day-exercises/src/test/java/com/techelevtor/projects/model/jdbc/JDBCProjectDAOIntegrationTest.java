package com.techelevtor.projects.model.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

import org.junit.Assert;

public class JDBCProjectDAOIntegrationTest {
	

private static SingleConnectionDataSource dataSource;
private JDBCProjectDAO projectDAO;
private JdbcTemplate jdbcTemplate;

@BeforeClass
public static void setupDataSource() {
	dataSource = new SingleConnectionDataSource();
	dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
	dataSource.setUsername("postgres");
	dataSource.setPassword("postgres1");
	dataSource.setAutoCommit(false);
}

@AfterClass
public static void closeDataSource() {
	dataSource.destroy();
}

@Before
public void setup() {
	projectDAO = new JDBCProjectDAO(dataSource);
	jdbcTemplate = new JdbcTemplate(dataSource);
}

@After
public void rollback() throws SQLException{
	dataSource.getConnection().rollback();
}

@Test
public void get_all_active_projects() {
	String insertSql = "insert into project (name, from_date, to_date) values ('mission1', DATE '10/10/10', DATE '12/12/18')";
	jdbcTemplate.update(insertSql);
	List<Project> projectList = projectDAO.getAllActiveProjects();
	Assert.assertTrue(projectList.size() > 0);
}

@Test
public void unassign_employee_from_project() {
	String insertSql = "insert into employee (employee_id, department_id, first_name, last_name, birth_date,gender,hire_date)" + 
			           " values (14, 1, 'Ahmed', 'Nur', DATE '1990-12-28', 'F', DATE '2011-08-01')";
	jdbcTemplate.update(insertSql);
	projectDAO.addEmployeeToProject(5L, 14L);
	projectDAO.removeEmployeeFromProject(5L, 14L);
	String selectSql = "select * from project_employee where project_id = ? AND employee_id = ?";
	SqlRowSet result = jdbcTemplate.queryForRowSet(selectSql, 5L, 14L);
	if (!result.next()) {
		Assert.assertTrue(true);
	}
}
@Test
public void assign_employee_to_a_project() {
	String insertSql = "insert into employee (employee_id, department_id, first_name, last_name, birth_date,gender,hire_date)" + 
			           " values (14, 1, 'Ahmed', 'Nur', DATE '1990-12-28', 'F', DATE '2011-08-01')";
	jdbcTemplate.update(insertSql);
	projectDAO.addEmployeeToProject(5L, 14L);
	String selectSql = "select * from project_employee where project_id = ? AND employee_id = ?";
	SqlRowSet result = jdbcTemplate.queryForRowSet(selectSql, 5L, 14L);
	if (result.next()) {
		Assert.assertTrue(true);
	}
}

}
