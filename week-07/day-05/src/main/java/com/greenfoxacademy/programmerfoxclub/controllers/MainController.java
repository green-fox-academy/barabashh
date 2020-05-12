package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private List<Fox> foxes = new ArrayList<>();

  public MainController() {
    foxes.add(new Fox("Mr. Fox",
        Arrays.asList("Write HTML", "code in java"), Fox.Food.PIZZA, Fox.Drink.LEMONADE));
    foxes.add(new Fox("Jozsi",
        Arrays.asList("Write Jozsi into HTML", "write Jozsi in java"), Fox.Food.PIZZA, Fox.Drink.LEMONADE));
    foxes.add(new Fox("Karak",
        null, Fox.Food.SALAD, Fox.Drink.WATER));
  }

  @RequestMapping(path = {"/", "/information"})
  public String index(@RequestParam(required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    Optional<Fox> optionalFox = foxes.stream()
        .filter(f -> f.getName().equals(name))
        .findFirst();
    if (!optionalFox.isPresent()) {
      return "redirect:/login";
    } else {
      Fox fox = optionalFox.get();
      model.addAttribute("fox", fox);
      model.addAttribute("name", name);
    }
    return "index";
  }

  @GetMapping(path = "/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping(path = "/login")
  public String postLogin(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping(path = "/nutritionStore")
  public String nutritionStoreGet(@RequestParam(required = false) String name, Model model){
    List<String> foodNames = Stream.of(Fox.Food.values())
        .map(Enum::name)
        .collect(Collectors.toList());
    model.addAttribute("foodNames", foodNames);
    model.addAttribute("name", name);
    return "nutritionStore";
  }

  @PostMapping(path = "/nutritionStore")
  public String nutritionStorePost(@RequestParam(required = false) String name
      ,@RequestParam String foodName, Model model) {
    return "nutritionStore";
  }
}
