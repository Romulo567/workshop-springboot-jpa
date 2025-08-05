package com.curso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.curso.entities.User;
import com.curso.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> readAll(){
		return repository.findAll();
	}
	
	public User read(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User creat(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
