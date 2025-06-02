package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired // Diz ao spring boot para injetar automaticamente uma instancia de UserRepository
    private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll(); // Retorna uma lista de todos os usuarios cadastrados
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id); // retorna um usuario pelo
		return obj.get();
	}
}
