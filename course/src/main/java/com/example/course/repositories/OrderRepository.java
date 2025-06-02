package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;

// herda JpaRepository isso faz com que herde metodos prontos pra acessar o banco de dados
public interface OrderRepository extends JpaRepository<Order, Long> {

}
