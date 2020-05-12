package com.greenfoxacademy.connwithmysql.controllers;

import com.greenfoxacademy.connwithmysql.models.Todo;
import com.greenfoxacademy.connwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(path = {"/", "/list"}, method = RequestMethod.GET)
  public String list(@RequestParam boolean isActive, Model model) {
    model.addAttribute("todos", todoRepository.findAllByDoneEquals(!isActive));
    return "todolist";
  }

  @PostMapping("/addTodo")
  public String addTodo(@ModelAttribute Todo todo) {
    return "addtodo";
  }

  @PostMapping("/addTodo")
  public String addTodo(@ModelAttribute Todo todo) {
    return "addtodo";
  }
}