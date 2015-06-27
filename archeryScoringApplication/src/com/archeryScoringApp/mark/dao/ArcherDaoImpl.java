package com.archeryScoringApp.mark.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.domain.Archer;



@Repository("archerDao")
public class ArcherDaoImpl implements ArcherDao {

	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly = false)
	@Override
	public void addArcher(Archer archer) {
		sessionFactory.getCurrentSession().saveOrUpdate(archer);
	}
	@Transactional(readOnly = false)
	@Override
	public List<Archer> getAllArchers() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Archer>) session.createQuery("from Archer").list();
	}
	@Transactional(readOnly = false)
	@Override
	public Archer getParticularArcher(String firstName, String lastName) {
		Session session = sessionFactory.getCurrentSession();
		Archer archer = (Archer) session.createQuery("FROM Archer archer WHERE archer.lname =:lastName")
		.setParameter("lastName", lastName).list().get(0);
		System.out.println("dao"+archer.getLname());
		return archer;
	}

}
