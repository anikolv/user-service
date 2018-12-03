package com.unisofia.fmi.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.unisofia.fmi.userservice.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
}
