package com.techelevtor.projects.model.jdbc;

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
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

public class JDBCDepartmentDAOIntegrationTest {
	
private static SingleConnectionDataSource dataSource;
private JDBCDepartmentDAO departmentDAO;
Department department;
JdbcTemplate jdbcTemplate;

/* Before any tests are run, this method initializes the datasource for testing. */
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
/* After all tests have finished running, this method will close the DataSource */
@AfterClass
public static void closeDataSource() throws SQLException {
	dataSource.destroy();
}

@Before
public void setup() {
	departmentDAO = new JDBCDepartmentDAO(dataSource);
	jdbcTemplate = new JdbcTemplate(dataSource);
}

/* After each test, we rollback any changes that were made to the database so that
 * everything is clean for the next test */
@After
public void rollback() throws SQLException {
	dataSource.getConnection().rollback();
}

@Test
public void get_all_departments() {
	department = new Department();
	department.setName("test");
	departmentDAO.createDepartment(department);
	List<Department> departmentList = departmentDAO.getAllDepartments();
	Assert.assertTrue(departmentList.size() > 0);
}

@Test
public void search_departments_by_name() {
	department = new Department();
	String nameSearch = "testsearch";
	department.setName(nameSearch);
	departmentDAO.createDepartment(department);
	List<Department> departmentList = departmentDAO.searchDepartmentsByName(nameSearch);
	String expectedName = departmentList.get(0).getName();
	Assert.assertEquals(expectedName, nameSearch);
}

@Test
public void save_department() {
	department = new Department();
	department.setName("savetest");
	department = departmentDAO.createDepartment(department);
	Assert.assertEquals("savetest", department.getName()); // new department "savetest"
	department.setName("savetest2"); // Act set new name to "savetest2"
	departmentDAO.saveDepartment(department); // update department with the new name
	Assert.assertEquals("savetest2", department.getName()); // check new department name is "savetest2"
	
}

@Test
public void create_department() {
	department = new Department();
	department.setName("creattest");
	department = departmentDAO.createDepartment(department);
	Assert.assertEquals("creattest", department.getName()); // check new department name is "creattest"
	
}

@Test
public void get_department_by_id() {
	department = new Department();
	department.setName("getIdTest");
	departmentDAO.createDepartment(department);
	Long expectId = department.getId();
	List<Department> departmentList = departmentDAO.searchDepartmentsByName("getIdTest"); 
    Long actualId = departmentList.get(0).getId() - 1;
	Assert.assertEquals(expectId, actualId); 
	
}


}
