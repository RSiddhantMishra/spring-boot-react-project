package com.learnreact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnreact.models.Users;
import com.learnreact.repositories.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository userRepository;

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	public Users getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public Users createUser(Users user) {
		return userRepository.save(user);
	}

	public Users updateUser(Long id, Users userDetails) {
		Users user = userRepository.findById(id).orElse(null);
		if (user != null) {
			user.setName(userDetails.getName());
			user.setEmail(userDetails.getEmail());
			user.setAddress(userDetails.getAddress());
			return userRepository.save(user);
		}
		return null;
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
