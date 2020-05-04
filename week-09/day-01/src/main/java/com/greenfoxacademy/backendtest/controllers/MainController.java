package com.greenfoxacademy.backendtest.controllers;

import com.greenfoxacademy.backendtest.models.Doubling;
import com.greenfoxacademy.backendtest.models.ErrorHandler;
import com.greenfoxacademy.backendtest.models.Greeting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<?> doubling(@RequestParam(name = "input", required = false) Integer inputNumber) {
    if (inputNumber == null) {
      ErrorHandler errHandler = new ErrorHandler("Please provide an input!");
      return new ResponseEntity<>(errHandler, HttpStatus.OK);
    } else {
      Doubling doubling = new Doubling(inputNumber, inputNumber * 2);
      return new ResponseEntity<>(doubling, HttpStatus.OK);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
    } else if (name == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a name!"), HttpStatus.BAD_REQUEST);
    } else if (title == null) {
      return new ResponseEntity<>(
          new ErrorHandler("Please provide a title!"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(
          new Greeting("Oh, hi there " + name + ", my dear " + title + "!")
          , HttpStatus.OK);
    }
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
  public String applySithReverser() {
    String text = "This is my example sentence. Just for fun.";

    return "Yoda";
  }
}
