package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired // Diz ao spring boot para injetar automaticamente uma instancia de UserRepository
    private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll(); // Retorna uma lista de todos os usuarios cadastrados
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id); // retorna um usuario pelo
		return obj.get();
	}
}
