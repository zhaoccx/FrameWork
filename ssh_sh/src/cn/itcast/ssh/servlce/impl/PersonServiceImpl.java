package cn.itcast.ssh.servlce.impl;

import cn.itcast.ssh.dao.PersonDao;
import cn.itcast.ssh.domain.Person;
import cn.itcast.ssh.service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}
	
	

}
