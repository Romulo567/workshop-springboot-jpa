package com.curso.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso.curso.entities.Category;
import com.curso.curso.entities.Order;
import com.curso.curso.entities.Product;
import com.curso.curso.entities.User;
import com.curso.curso.entities.enums.OrderStatus;
import com.curso.curso.repositories.CategoryRepository;
import com.curso.curso.repositories.OrderRepository;
import com.curso.curso.repositories.ProductRepository;
import com.curso.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Fiction book", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Good image quality", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Faster than you can think", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Play the best games", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		User u1 = new User(null, "Romulo", "romulo@gmail.com", "9999998", "123456");
		User u2 = new User(null, "Maria", "maria@gmail.com", "98888888", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-07-29T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2025-07-30T18:58:07Z"), OrderStatus.WAITING_PAYMENT , u2);
		Order o3 = new Order(null, Instant.parse("2025-07-31T15:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
