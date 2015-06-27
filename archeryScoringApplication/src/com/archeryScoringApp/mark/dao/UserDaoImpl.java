package com.archeryScoringApp.mark.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly = false)
	@Override
	public  List<User> getUSerByName(String userName) {
	
		System.out.println("your in user dao");
		Session session = sessionFactory.getCurrentSession();
		return (List<User>) session.createQuery("from User").list();
	}

}
