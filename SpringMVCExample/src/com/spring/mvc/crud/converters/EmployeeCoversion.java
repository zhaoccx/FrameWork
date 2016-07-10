/**
 * 
 */
package com.spring.mvc.crud.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.spring.mvc.crud.entities.Department;
import com.spring.mvc.crud.entities.Employee;

/**
 * @author zhaocc
 *
 */
@Component
public class EmployeeCoversion implements Converter<String, Employee> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.core.convert.converter.Converter#convert(java.lang.
	 * Object)
	 */
	@Override
	public Employee convert(String source) {
		if (source != null) {
			String[] vals = source.split("-");
			// GG-abc@163.com-0-105
			if (vals != null && vals.length == 4) {
				String lastName = vals[0];
				String email = vals[1];
				Integer gender = Integer.parseInt(vals[2]);
				Department department = new Department();
				department.setId(Integer.parseInt(vals[3]));

				Employee employee = new Employee(null, lastName, email, gender, department);
				System.out.println(source + "--convert--" + employee);
				return employee;
			}
		}
		return null;
	}

}
