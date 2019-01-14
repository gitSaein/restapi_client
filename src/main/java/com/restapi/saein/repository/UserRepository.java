package com.restapi.saein.repository;

import java.util.List;

import com.restapi.saein.dto.User;

public interface UserRepository extends CrudRepository<User, Long>{

	long saveUser(User user);
	
	long deleteByUserId(User user);
	
	long updateByUserId(User user);
	
	List<User> readByUserId(User user);
	
}
