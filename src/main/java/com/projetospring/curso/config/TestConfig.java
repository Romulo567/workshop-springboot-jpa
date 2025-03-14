package com.projetospring.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospring.curso.entities.User;
import com.projetospring.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Eduarda", "maria@gmail.com", "9888888", "123456");
		User u2 = new User(null, "Romulo", "romulo@gmail.com", "9777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
