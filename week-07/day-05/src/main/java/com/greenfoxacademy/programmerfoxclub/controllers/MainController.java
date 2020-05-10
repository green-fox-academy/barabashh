package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private List<Fox> foxes = new ArrayList<>();

  public MainController() {
    foxes.add(new Fox("Mr. Fox",
        Arrays.asList("Write HTML", "code in java"), "pizza", Fox.Drink.LEMONADE));
    foxes.add(new Fox("Karak",
        null, "salad", Fox.Drink.WATER));
  }

  @GetMapping(path = "/")
  public String index() {
    return "index";
  }

  @GetMapping(path = "/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping(path = "/")
  public String postLogin(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }
}
