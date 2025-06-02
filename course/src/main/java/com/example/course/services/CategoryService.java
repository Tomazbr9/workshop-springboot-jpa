package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired // Diz ao spring boot para injetar automaticamente uma instancia de UserRepository
    private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll(); // Retorna uma lista de todos os usuarios cadastrados
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); // retorna um usuario pelo
		return obj.get();
	}
}
