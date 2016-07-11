/**
 * 
 */
package com.spring.mvc.crud.handers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mvc.crud.daos.DepartmentDao;
import com.spring.mvc.crud.daos.EmployeeDao;
import com.spring.mvc.crud.entities.Employee;
import com.spring.mvc.crud.exception.UserResponseStatusException;

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

	@Autowired
	private ResourceBundleMessageSource messageSource;

	@RequestMapping("testResponseResolver")
	public String testResponseResolverException(@RequestParam("i") int i) {
		if (i == 15) {
			throw new UserResponseStatusException();
		}
		return "success";
	}

	@RequestMapping("testException")
	public String testException(@RequestParam("i") int i) {
		System.out.println(10 / i);
		return "success";
	}

	@RequestMapping("testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException {
		System.out.println(desc);
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getInputStream());
		return "success";
	}

	@RequestMapping("testI18n")
	public String testI18n(Locale locale) {
		String message = messageSource.getMessage("i18n.username", null, locale);
		System.out.println(message);
		return "i18n";
	}

	// 模仿下载
	@RequestMapping("/testResponseEntity")
	public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
		byte[] body = null;
		ServletContext servletContext = session.getServletContext();
		InputStream in = servletContext.getResourceAsStream("/files/RELEASE-NOTES.txt");
		body = new byte[in.available()];
		in.read(body);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=RELEASE-NOTES.txt");

		HttpStatus statusCode = HttpStatus.OK;

		ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
		return response;
	}

	@ResponseBody
	@RequestMapping("testHttpMessageConverter")
	public String testHttpMessageConverter(@RequestBody String body) {
		System.out.println(body);

		return "hello " + new Date();
	}

	@ResponseBody
	@RequestMapping("/testJson")
	public Collection<Employee> testJson() {
		return employeeDao.getAllEmployees();
	}

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
	public String saveEmployee(@Valid Employee employee, BindingResult result, Map<String, Object> map) {
		System.out.println(employee);
		if (result.getErrorCount() > 0) {
			System.out.println("出错了");
			for (FieldError error : result.getFieldErrors()) {
				System.out.println(error.getField() + ":" + error.getDefaultMessage());
			}
			map.put("departments", departmentDao.getAllDepartments());
			return "input";

		}
		employeeDao.saveEmployee(employee);
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
