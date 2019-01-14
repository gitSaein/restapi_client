package com.restapi.saein.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {

	@Column(name = "user_id")
	private String id;
	
	@Column(name = "user_pwd")
	private String password;
	
}
