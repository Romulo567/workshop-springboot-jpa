package com.projetospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
