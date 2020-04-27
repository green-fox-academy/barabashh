package com.greenfoxacademy.todos.repositories;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
