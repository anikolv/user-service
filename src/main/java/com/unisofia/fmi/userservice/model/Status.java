package com.unisofia.fmi.userservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
public @Data class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean success;
	
	private String message;
	
	private long id;
	
	public Status(Boolean success, String message, long userId) {
		this.success = success;
		this.message = message;
		this.id = userId;
	}
	
	public Status(Boolean success, long userId) {
		this.success = success;
		this.id = userId;
	}
	
	public Status(Boolean success) {
		this.success = success;
	}
	
	public Status(Boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	public Status() {}
	
}
