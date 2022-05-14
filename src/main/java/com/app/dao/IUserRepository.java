package com.app.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.User;
@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	
	//custom method --in UserRepository
	@Query("FROM User WHERE userName=?1 and password=?2 and isActive='y'")
	public User findUserByUsernameAndPassword(String userName,String password);

	

}
