package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Todo;
import com.example.demo.repository.TodoRepository;

@CrossOrigin(origins = { "*" })
@RestController
public class TodoController {

	@Autowired
	private TodoRepository repo;

	@GetMapping("/todos")
	public List<Todo> getAll() {
		return repo.findAll();
	}

	@PostMapping(value = "/todos", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public Todo addRepo(@RequestBody Todo todo) {
		return repo.save(todo);
	}

	@PutMapping(value = "/todos", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public Todo updateRepo(@RequestBody Todo todo) {
		return repo.save(todo);
	}

	@DeleteMapping(value = "/todos/{todoid}")
	public void deleteRepo(@PathVariable(name = "todoid") int todoid) {
		repo.deleteById(todoid);
	}
}
