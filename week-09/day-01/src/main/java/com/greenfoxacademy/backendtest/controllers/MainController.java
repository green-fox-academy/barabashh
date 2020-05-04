package com.greenfoxacademy.backendtest.controllers;

import com.greenfoxacademy.backendtest.models.Doubling;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @GetMapping("/")
  public String Index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public Doubling Doubling(@RequestParam(name = "input") int inputNumber) {
    Doubling doubling = new Doubling();
    doubling.received = inputNumber;
    doubling.result = inputNumber * 2;
    return doubling;
  }

  @GetMapping("/arrays")
  @ResponseBody
  public String arrayHandler() {
    String what = "double";
    //int[] numbers = {1, 2, 5, 10};
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 10));
    if (what.equals("sum")) {
      Integer sum = numbers
          .stream()
          .reduce(0, Integer::sum);
      return String.valueOf(sum);
    }
    if (what.equals("multiply")) {
      Integer result = numbers
          .stream()
          .reduce(1, (a, b) -> a * b);
      return String.valueOf(result);
    }
    if (what.equals("double")) {
      List<Integer> result =
      numbers
          .stream()
          .map(n -> n * 2)
          .collect(Collectors.toList());
      return String.valueOf(result);
    }
    return "hello";
  }

  @GetMapping("/sith")
  public String applySithReverser(){
    String text = "This is my example sentence. Just for fun.";

    return "Yoda";
  }
}
