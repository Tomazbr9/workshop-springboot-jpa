package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

// herda JpaRepository isso faz com que herde metodos prontos pra acessar o banco de dados
public interface UserRepository extends JpaRepository<User, Long> {

}
