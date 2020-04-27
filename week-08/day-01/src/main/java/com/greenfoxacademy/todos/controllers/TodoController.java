package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
    Todo todo1 = new Todo();
    todo1.setTitle("Start the day");
    Todo todo2 = new Todo();
    todo2.setTitle("Finish H2");

    todoRepository.save(todo1);
    todoRepository.save(todo2);
  }

  @RequestMapping(path = {"/", "/list"}, method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
