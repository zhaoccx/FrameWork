package cn.itcast.ssh.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.PersonDao;
import cn.itcast.ssh.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {

	public void savePerson(Person person) {
		this.getHibernateTemplate().save(person);
	}

}
