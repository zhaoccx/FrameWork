/**
 * 
 */
package com.spring.mvc.crud.handers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.crud.daos.DepartmentDao;
import com.spring.mvc.crud.daos.EmployeeDao;
import com.spring.mvc.crud.entities.Employee;

/**
 * @author zhaocc
 *
 */
@RequestMapping("/mvccrud")
@Controller
public class EmployeeHander {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;

	@RequestMapping("testConversionServiceConverer")
	public String testConverter(@RequestParam("employee") Employee employee) {
		System.out.println("save: " + employee);
		employeeDao.saveEmployee(employee);
		return "redirect:/mvccrud/emplist";
	}

	@RequestMapping(value = "/myconvertest", method = RequestMethod.GET)
	public String getCouvent(Map<String, Object> map) {
		return "myconvertest";
	}

	@ModelAttribute
	public void moduleAurs(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		if (null != id) {
			map.put("employee", employeeDao.getEmployee(id));
		}
	}

	@RequestMapping(value = "/emp", method = RequestMethod.PUT)
	public String updateEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
		return "redirect:/mvccrud/emplist";
	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public String showEmployee(@PathVariable("id") Integer id, Map<String, Object> map) {
		map.put("employee", employeeDao.getEmployee(id));
		map.put("departments", departmentDao.getAllDepartments());
		return "input";
	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id") Integer id) {
		employeeDao.deleteEmployee(id);
		return "redirect:/mvccrud/emplist";
	}

	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public String saveEmployee(Employee employee, BindingResult result) {
		System.out.println(employee);
		employeeDao.saveEmployee(employee);
		if (result.getErrorCount() > 0) {
			System.out.println("出错了");
			for (FieldError error : result.getFieldErrors()) {
				System.out.println(error.getField() + ":" + error.getDefaultMessage());
			}

		}
		return "redirect:/mvccrud/emplist";
	}

	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public String getInputView(Map<String, Object> map) {
		map.put("departments", departmentDao.getAllDepartments());
		map.put("employee", new Employee());
		return "input";
	}

	@RequestMapping("/emplist")
	public String showAllListEmployees(Map<String, Object> map) {
		map.put("employees", employeeDao.getAllEmployees());
		return "list";
	}

	// @InitBinder
	// public void initBur(WebDataBinder binder) {
	// binder.setDisallowedFields("lastName");
	// }
}
