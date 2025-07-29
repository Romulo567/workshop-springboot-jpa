package com.curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
