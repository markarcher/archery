package com.archeryScoringApp.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.archeryScoringApp.mark.dao.ArcherDao;
import com.archeryScoringApp.mark.domain.Archer;

@Repository("archerDao")
public class ArcherServiceImpl implements ArcherService {
	
	@Autowired
	private ArcherDao archerDao;
	
	@Override
	public void addArcher(Archer archer) {
		archerDao.addArcher(archer);
		
	}

	@Override
	public List<Archer> getAllArchers() {
		List<Archer> archers = archerDao.getAllArchers();
		return archers;
	}

	@Override
	public Archer getParticularArcher(String firstName, String lastName) {
		Archer archerRecentlyAdded = archerDao.getParticularArcher(firstName, lastName);
		return archerRecentlyAdded;
	}

	

}
