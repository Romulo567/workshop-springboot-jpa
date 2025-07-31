package com.curso.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.curso.entities.OrderItem;
import com.curso.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
