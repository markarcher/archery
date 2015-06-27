package com.archeryScoringApp.mark.service;

import java.util.List;

import com.archeryScoringApp.mark.domain.User;

public interface UserService {

	User getUserByName(String userName, String password);
	
}
