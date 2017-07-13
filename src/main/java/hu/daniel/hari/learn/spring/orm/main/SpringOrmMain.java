package hu.daniel.hari.learn.spring.orm.main;



import hu.daniel.hari.learn.spring.orm.model.Person;
import hu.daniel.hari.learn.spring.orm.service.PersonService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringOrmMain {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		PersonService personService = ctx.getBean(PersonService.class);
		
		//Do some data operation
		
		personService.add(new Person(null, "Bulb","ffff"));
		personService.add(new Person(null, "Dijone"," mustard"));
		
		System.out.println("listAll: " + personService.listAll());
		
		ctx.close();
		
	}
}
