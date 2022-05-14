package com.app.service;

import com.app.entity.User;

public interface IUserService {
	
	//custom method --in UserRepository
	public User findUserByNameAndPassword(String user_name,String password);

}
