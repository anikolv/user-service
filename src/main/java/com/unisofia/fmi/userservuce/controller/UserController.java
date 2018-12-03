package com.unisofia.fmi.userservuce.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisofia.fmi.userservice.exception.UserNotFoundException;
import com.unisofia.fmi.userservice.model.User;
import com.unisofia.fmi.userservice.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/create")
	public void saveUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@GetMapping(value = "/get")
	public User getUser(@PathParam("id") Long id) throws UserNotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
	}

}
