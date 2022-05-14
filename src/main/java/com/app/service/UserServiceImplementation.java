package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserRepository;
import com.app.entity.User;

@Service
public class UserServiceImplementation implements IUserService {

	//Field Injection
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public User findUserByNameAndPassword(String user_name, String password) {
		
		User user=userRepository.findUserByUsernameAndPassword(user_name, password);
		//condition check
		if(user_name.equals(user.getUserName()) && password.equals(user.getPassword())) {
			return user;
		}else {
			return null;
		}
		
	}
}
