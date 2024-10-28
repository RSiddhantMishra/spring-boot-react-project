package com.learnreact.controller;

import java.util.List;

//UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnreact.models.Users;
import com.learnreact.services.UsersService;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	@Autowired
	private UsersService userService;

	@GetMapping
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public Users getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public Users createUser(@RequestBody Users user) {
		return userService.createUser(user);
	}

	@PutMapping("/{id}")
	public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
}
