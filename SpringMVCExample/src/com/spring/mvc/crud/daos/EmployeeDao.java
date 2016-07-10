/**
 * 
 */
package com.spring.mvc.crud.daos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.crud.entities.Department;
import com.spring.mvc.crud.entities.Employee;

/**
 * @author zhaocc
 *
 */
@Service
public class EmployeeDao {
	private static Map<Integer, Employee> employees = null;

	@Autowired
	private DepartmentDao departmentDao;

	static {
		employees = new HashMap<Integer, Employee>();

		employees.put(1001, new Employee(1001, "AAAAAAA", "aa@163.com", 1, new Department(101, "AAA")));
		employees.put(1002, new Employee(1002, "BBBBBBB", "bb@163.com", 1, new Department(102, "BBB")));
		employees.put(1003, new Employee(1003, "CCCCCCC", "cc@163.com", 0, new Department(103, "CCC")));
		employees.put(1004, new Employee(1004, "DDDDDDD", "dd@163.com", 0, new Department(104, "DDD")));
		employees.put(1005, new Employee(1005, "EEEEEEE", "ee@163.com", 1, new Department(105, "EEE")));
		employees.put(1006, new Employee(1006, "FFFFFFF", "ff@163.com", 1, new Department(106, "FFF")));
		employees.put(1007, new Employee(1007, "GGGGGGG", "gg@163.com", 1, new Department(107, "GGG")));
	}

	private static Integer initId = 1008;

	public void saveEmployee(Employee employee) {
		if (employee.getId() == null) {
			employee.setId(initId++);
		}

		employee.setDepartment(departmentDao.getDepartmentByKey(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}

	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public Employee getEmployee(Integer id) {
		return employees.get(id);
	}

	public void deleteEmployee(Integer id) {
		employees.remove(id);
	}
}
