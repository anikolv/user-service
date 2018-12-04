package com.unisofia.fmi.userservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(Include.NON_NULL)
@Data 
@EqualsAndHashCode(callSuper=false)
public class UserResponse extends Status implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	private Iterable<User> users;
	
	public UserResponse(Boolean success, String message, User user) {
		super(success, message);
		this.user = user;
	}
	
	public UserResponse(Boolean success, String message, Iterable<User> users) {
		super(success);
		this.users = users;
	}
}