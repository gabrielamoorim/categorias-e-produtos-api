package com.gadev.segundo_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gadev.segundo_projeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
