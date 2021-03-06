package com.unisofia.fmi.userservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unisofia.fmi.userservice.exception.UserNotFoundException;
import com.unisofia.fmi.userservice.model.Status;
import com.unisofia.fmi.userservice.model.User;
import com.unisofia.fmi.userservice.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/create")
	public Status saveUser(@RequestBody User user) {
		Optional<User> optional = userRepository.findByToken(user.getToken());
		if (!optional.isPresent()) {
			User createdEntity = userRepository.save(user);	
			return new Status(true, createdEntity.getId());
		}
		return new Status(false, "User already exists !", optional.get().getId());
	}
	
	@GetMapping(value = "/get")
	public User getUser(@RequestParam Long id) throws UserNotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
	}
	
	@GetMapping(value = "/getAll")
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

}
