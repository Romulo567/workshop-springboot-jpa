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
	
	public User creat(User obj) {
		return repository.save(obj);
	}
	
	public User read(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User update(Long id, User obj) {
		User entity = read(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public List<User> readAll(){
		return repository.findAll();
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		
		entity.setEmail(obj.getEmail());
		
		entity.setPhone(obj.getPhone());
		
	}
}
