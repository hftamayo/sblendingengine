package com.tamayo.lendingengine;

import com.tamayo.lendingengine.domain.model.User;
import com.tamayo.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1, "John", "Jordan", 27,"Software Developer"));
		userRepository.save(new User(2, "Lionel", "Messi", 30,"Software Architect"));
		userRepository.save(new User(3, "Luis", "Suarez", 32,"DevOps Developer"));



	}
}
