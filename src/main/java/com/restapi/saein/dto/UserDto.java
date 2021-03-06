package com.restapi.saein.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_user")
public class UserDto {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_pwd")
	private String userPwd;
	
}
