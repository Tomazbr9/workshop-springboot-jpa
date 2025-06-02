package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;

// herda JpaRepository isso faz com que herde metodos prontos pra acessar o banco de dados
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
