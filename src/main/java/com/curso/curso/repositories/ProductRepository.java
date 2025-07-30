package com.curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
