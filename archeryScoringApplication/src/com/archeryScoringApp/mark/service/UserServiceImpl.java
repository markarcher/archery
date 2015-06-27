package com.archeryScoringApp.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.dao.UserDao;
import com.archeryScoringApp.mark.domain.User;

@Repository("userDao")
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    
	@Transactional(readOnly = false)
	@Override
	public User getUserByName(String userName, String password) {

		List<User> users = userDao.getUSerByName(userName);
		User validUser = new User();
	
		for(User user : users){
			String nameOfUser = user.getUserName();
			String userPassword = user.getPassword();
			if(nameOfUser.equals(userName) && userPassword.equals(password)){
			   	validUser = user;
			}
		}
		return validUser;
	}

}
