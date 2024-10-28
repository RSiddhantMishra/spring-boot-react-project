package com.learnreact.userdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.learnreact.repositories")
@ComponentScan(basePackages = {
	"com.learnreact"
})
@EntityScan(basePackages = "com.learnreact.models")
public class UserdeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdeskApplication.class, args);
	}

}
