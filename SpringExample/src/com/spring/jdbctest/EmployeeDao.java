/**
 * 
 */
package com.spring.jdbctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author zhaocc
 *
 */
@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Employee getEmployeeById(Integer id) {
		String sql = "SELECT id,last_name,email from employees where id = ? ";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}
}
