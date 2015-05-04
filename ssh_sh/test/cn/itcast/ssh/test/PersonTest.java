package cn.itcast.ssh.test;

import org.junit.Test;

import cn.itcast.ssh.domain.Person;
import cn.itcast.ssh.service.PersonService;
import cn.itcast.ssh.util.SqringInit;


public class PersonTest extends SqringInit{

	@Test
	public void TestPerson(){
		PersonService personService= (PersonService) context.getBean("personService");
		Person person = new Person();
		person.setPname("aa");
		person.setPsex("1");
		personService.savePerson(person);
	}
}
