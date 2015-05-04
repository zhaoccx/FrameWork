package cn.itcast.s2sh.struts2.action.sh;

import org.apache.struts2.ServletActionContext;

import cn.itcast.s2sh.domain.sh.Person;
import cn.itcast.s2sh.sh.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String savePerson(){
		Person person = new Person();
		person.setPname("afds");
		this.personService.savePerson(person);
		return null;
	}
	
	public String showPerson(){
		Person person = this.personService.getPersonByID(2L);
		ServletActionContext.getRequest().setAttribute("person", person);
		return "index";
	}
}
