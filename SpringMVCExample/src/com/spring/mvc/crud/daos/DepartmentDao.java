/**
 * 
 */
package com.spring.mvc.crud.daos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.mvc.crud.entities.Department;

/**
 * @author zhaocc
 *
 */
@Service
public class DepartmentDao {

	private static Map<Integer, Department> departments = null;

	static {
		departments = new HashMap<Integer, Department>();
		departments.put(101, new Department(101, "AAA"));
		departments.put(102, new Department(102, "BBB"));
		departments.put(103, new Department(103, "CCC"));
		departments.put(104, new Department(104, "DDD"));
		departments.put(105, new Department(105, "EEE"));
		departments.put(106, new Department(106, "FFF"));
		departments.put(107, new Department(107, "GGG"));
	}

	public Collection<Department> getAllDepartments() {
		return departments.values();
	}

	public Department getDepartmentByKey(Integer id) {
		return departments.get(id);
	}
}
