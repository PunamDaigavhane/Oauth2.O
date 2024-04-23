package com.auth.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "login")
@Getter
@Setter
@ToString
public class Login {

	@Id
	@Column(name = "login_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loginId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
}
