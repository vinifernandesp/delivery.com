package com.devsuperior.delivery.com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.delivery.com.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List <Product> findAllByOrderByNameAsc();
}
