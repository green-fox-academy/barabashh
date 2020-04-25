package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping(path = "/")
  public String index(){
    return "index";
  }

  @GetMapping(path = "/login")
  public String getLogin(){
    return "login";
  }

  @PostMapping(path = "/")
  public String postLogin(@RequestParam String name, Model model){
    model.addAttribute("name",name);
    return "index";
  }
}
