package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;

// herda JpaRepository isso faz com que herde metodos prontos pra acessar o banco de dados
public interface ProductRepository extends JpaRepository<Product, Long> {

}
