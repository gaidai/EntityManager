package hu.daniel.hari.learn.spring.orm.dao;

import hu.daniel.hari.learn.spring.orm.model.Person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class PersonDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(Person person) {
		em.persist(person);
	}

	public List<Person> findAll() {
		return em.createQuery("SELECT p FROM Person p").getResultList();
	}

}
