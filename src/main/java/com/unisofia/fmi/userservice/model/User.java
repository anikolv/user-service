package com.unisofia.fmi.userservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 private String username;
	 private String password;
	 private String firstName;
	 private String lastName;
	 private String phoneNumber;
	 private String email;
}
