package com.saifiahmada.zhs.belajar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saifiahmada.zhs.belajar.dao.PersonDao;
import com.saifiahmada.zhs.belajar.entity.Person;

/** @author Saifi Ahmada Nov 27, 2014 12:30:19 PM  **/
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	public void save(Person person) {
		personDao.save(person); 
	}

}
