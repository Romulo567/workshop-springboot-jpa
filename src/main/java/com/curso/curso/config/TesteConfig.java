package com.curso.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso.curso.entities.User;
import com.curso.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Romulo", "romulo@gmail.com", "9999998", "123456");
		User u2 = new User(null, "Maria", "maria@gmail.com", "98888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
