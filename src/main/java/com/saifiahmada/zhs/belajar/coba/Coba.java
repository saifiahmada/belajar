package com.saifiahmada.zhs.belajar.coba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.saifiahmada.zhs.belajar.entity.Person;
import com.saifiahmada.zhs.belajar.service.PersonService;

/** @author Saifi Ahmada Nov 27, 2014 12:49:00 PM  **/

public class Coba {
	
	public static void main (String args []) {
		Person person = new Person();
		person.setNama("Saifi Ahmada");
		person.setAlamat("Banjarmasin");
		getPersonService().save(person);
	}
	
	private static PersonService getPersonService(){
		ApplicationContext ac = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/applicationContext.xml");
		
		PersonService services = (PersonService) ac.getBean("personService");
		return services;
	}

}
