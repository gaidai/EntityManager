package hu.daniel.hari.learn.spring.orm.service;

import hu.daniel.hari.learn.spring.orm.dao.PersonDao;

import hu.daniel.hari.learn.spring.orm.model.Person;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonService {

	@Autowired
	private PersonDao personDao;

	@Transactional
	public void add(Person person) {
		personDao.persist(person);
	}
	
	@Transactional
	public void addAll(Collection<Person> persons) {
		for (Person person : persons) {
			personDao.persist(person);
		}
	}

	@Transactional(readOnly = true)
	public List<Person> listAll() {
		return personDao.findAll();

	}

}
