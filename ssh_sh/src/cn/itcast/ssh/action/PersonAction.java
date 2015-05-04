package cn.itcast.ssh.action;

import cn.itcast.ssh.domain.Person;
import cn.itcast.ssh.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5517388821699880431L;
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public String savePerson() {
		Person person = new Person();
		person.setPname("BB");
		person.setPsex("2");
		this.personService.savePerson(person);

		return null;

	}

}
