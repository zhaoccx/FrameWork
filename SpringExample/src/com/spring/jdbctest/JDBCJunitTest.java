/**
 * 
 */
package com.spring.jdbctest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 * @author zhaocc
 *
 */
public class JDBCJunitTest {

	private ApplicationContext context = null;
	private JdbcTemplate jdbcTemplate = null;
	private EmployeeDao employeeDao = null;
	private DepartmentDao departmentDao = null;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate = null;
	{
		context = new ClassPathXmlApplicationContext("com/spring/jdbctest/beans-jdbc.xml");
		jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		employeeDao = context.getBean(EmployeeDao.class);
		departmentDao = context.getBean(DepartmentDao.class);
		namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
	}

	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSources = context.getBean(DataSource.class);
		System.out.println(dataSources.getConnection());
	}

	@Test
	public void testUpdate() {
		String SQL = "UPDATE employees set last_name = ? where id = ? ";
		jdbcTemplate.update(SQL, "李的", 1);
	}

	@Test
	public void testBatchUpdate() {
		String sql = "INSERT INTO employees(last_name,email,dept_id) VALUES(?,?,?)";
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[] { "aa", "aa@163.com", 1 });
		batchArgs.add(new Object[] { "bb", "bb@163.com", 2 });
		batchArgs.add(new Object[] { "cc", "cc@163.com", 3 });
		batchArgs.add(new Object[] { "dd", "dd@163.com", 3 });
		batchArgs.add(new Object[] { "ee", "ee@163.com", 2 });
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}

	@Test
	public void testQueryForOjbect() {
		String sql = "SELECT id,last_name,email from employees where id = ? ";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 2);
		System.out.println(employee);
	}

	@Test
	public void testQueryForOjbect3() {
		Employee employeeById = employeeDao.getEmployeeById(1);
		System.out.println(employeeById);
	}

	@Test
	public void testQueryForOjbectDepartment() {
		Department department = departmentDao.get(1);
		System.out.println(department);
	}

	@Test
	public void testQueryForList() {
		String sql = "SELECT id,last_name,email from employees where id > ? ";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		List<Employee> employee = jdbcTemplate.query(sql, rowMapper, 2);
		System.out.println(employee);
	}

	@Test
	public void testQueryForOjbect2() {
		String sql = "SELECT count(id) from employees";
		Long long1 = jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(long1);
	}

	@Test
	public void testNamedPareTest() {
		String string = "INSERT INTO department (deptname) VALUES (:deptname)";
		Map<String, Object> map = new HashMap<>();
		map.put("deptname", "就业部");
		namedParameterJdbcTemplate.update(string, map);
	}

	@Test
	public void testNamedPareTest2() {
		String string = "INSERT INTO department (deptname) VALUES (:deptname)";
		Department department = new Department();
		department.setDeptname("教育部");
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(department);
		namedParameterJdbcTemplate.update(string, paramSource);
	}

}
