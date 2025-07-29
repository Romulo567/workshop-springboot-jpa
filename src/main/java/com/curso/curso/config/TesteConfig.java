package com.curso.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso.curso.entities.Order;
import com.curso.curso.entities.User;
import com.curso.curso.repositories.OrderRepository;
import com.curso.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Romulo", "romulo@gmail.com", "9999998", "123456");
		User u2 = new User(null, "Maria", "maria@gmail.com", "98888888", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-07-29T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2025-07-30T18:58:07Z"), u2);
		Order o3 = new Order(null, Instant.parse("2025-07-31T15:53:07Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
