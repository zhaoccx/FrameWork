/**
 * 
 */
package com.spring.jdbctest;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author zhaocc
 *
 */
@Repository
public class DepartmentDao extends JdbcDaoSupport {

	@Autowired
	public void setDataSource2(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public Department get(Integer id) {
		String sql = "SELECT id,deptname from department where id = ? ";
		RowMapper<Department> rowMapper = new BeanPropertyRowMapper<>(Department.class);
		return getJdbcTemplate().queryForObject(sql, rowMapper, id);
	}
}
