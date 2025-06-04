package com.example.course.resources;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Product;
import com.example.course.services.ProductService;

@RestController // Avisa que vai responder requisições http e retornar dados json nos metodos
@RequestMapping(value = "/products") // Define que todas as rotas dessa classe comeã com /Products
public class ProductResource {
	
	@Autowired // injeta automenticamente o ProductService
	private ProductService service;
	
	@GetMapping // Mapeia requisições http GET
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list); // Retorna uma lista que representa uma resposta http com status 200 ok
    }
	
	
	@GetMapping(value = "/{id}") // Mapeia com parametro
	public ResponseEntity<Product> findById(@PathVariable Long id){ // passa {id} para o parametroProductResource.javaProductResource.java
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
