package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;
import com.example.course.services.UserService;

@RestController // Avisa que vai responder requisições http e retornar dados json nos metodos
@RequestMapping(value = "/users") // Define que todas as rotas dessa classe comeã com /users
public class UserResource {
	
	@Autowired // injeta automenticamente o UserService
	private UserService service;
	
	@GetMapping // Mapeia requisições http GET
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list); // Retorna uma lista que representa uma resposta http com status 200 ok
    }
	
	
	@GetMapping(value = "/{id}") // Mapeia com parametro
	public ResponseEntity<User> findById(@PathVariable Long id){ // passa {id} para o parametroUserResource.javaUserResource.java
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
