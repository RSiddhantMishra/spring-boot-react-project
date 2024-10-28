package com.learnreact.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.learnreact.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
}
