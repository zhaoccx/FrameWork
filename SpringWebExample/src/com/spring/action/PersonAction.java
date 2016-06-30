/**
 * 
 */
package com.spring.action;

import com.spring.service.PersonService;

/**
 * @author zhaocc
 *
 */
public class PersonAction {

	private PersonService personService;

	/**
	 * @param personService
	 *            the personService to set
	 */
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public String execute() {
		System.out.println("execute....");
		personService.save();
		return "success";
	}

}
