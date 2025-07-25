package com.curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
