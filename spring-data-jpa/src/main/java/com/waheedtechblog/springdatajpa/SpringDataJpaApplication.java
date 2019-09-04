package com.waheedtechblog.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.waheedtechblog.springdatajpa.domain.Users;
import com.waheedtechblog.springdatajpa.service.UserService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.waheedtechblog.springdatajpa.dao")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserService userService) {
		return (args) -> {
			// save few entry of users
			userService.addUser(new Users("Abdul", "Waheed", "abdulwaheed18@gmail.com"));
			userService.addUser(new Users("Captain", "Marvel", "captainAmerica@marvel.com"));
			userService.addUser(new Users("Dark", "Knight", "IamBatman@dc.com"));
		};
	}

}
