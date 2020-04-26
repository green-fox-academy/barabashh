package com.greenfoxacademy.springstart.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  private AtomicLong greetCount = new AtomicLong();
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou",
      "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo",
      "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo",
      "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo",
      "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
      "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("greetCount", greetCount.incrementAndGet());
    return "greeting";
  }

  @RequestMapping("/web/helloAllWorld")
  public String helloAllWorld(@RequestParam int size, @RequestParam String color, Model model) {
    List<String> orderedHellos = Arrays.asList(hellos)
        .stream()
        .sorted()
        .collect(Collectors.toList());

    model.addAttribute("fontSize", size);
    model.addAttribute("fontColor", color);
    model.addAttribute("hellos", orderedHellos);
    return "helloAllWorld";
  }

}
