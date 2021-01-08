package com.devsuperior.delivery.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.delivery.com.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
