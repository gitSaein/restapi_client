package com.restapi.saein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restapi.saein.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long>{

	@Query("select * from tb_user")
	List<UserDto> findAllUser();
	
	@Query
	UserDto createUser(UserDto dto);
}
