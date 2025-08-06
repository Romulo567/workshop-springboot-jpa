package com.curso.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.curso.curso.entities.User;
import com.curso.curso.repositories.UserRepository;
import com.curso.curso.services.exceptions.DatabaseException;
import com.curso.curso.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User creat(User obj) {
		return repository.save(obj);
	}
	
	public User read(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User update(Long id, User obj) {
		try {
		User entity = read(id);
		updateData(entity, obj);
		return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
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
