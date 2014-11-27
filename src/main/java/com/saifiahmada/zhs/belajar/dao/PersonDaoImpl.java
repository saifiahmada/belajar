package com.saifiahmada.zhs.belajar.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saifiahmada.zhs.belajar.entity.Person;

/** @author Saifi Ahmada Nov 27, 2014 12:23:38 PM  **/
@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

}
