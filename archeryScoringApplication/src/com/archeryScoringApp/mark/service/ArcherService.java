package com.archeryScoringApp.mark.service;

import java.util.List;

import com.archeryScoringApp.mark.domain.Archer;

public interface ArcherService {

	void addArcher(Archer archer);

	List<Archer> getAllArchers();

	Archer getParticularArcher(String firstName, String lastName);

}
