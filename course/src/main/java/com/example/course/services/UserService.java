package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired // Diz ao spring boot para injetar automaticamente uma instancia de UserRepository
    private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll(); // Retorna uma lista de todos os usuarios cadastrados
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id); // retorna um usuario pelo
		return obj.get();
	}
}
