package com.restapi.saein.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restapi.saein.dto.UserDto;

@Repository
public interface UserRepository extends CrudRepository<UserDto, Long>{
	
}
