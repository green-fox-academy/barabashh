package com.greenfoxacademy.backendtest.controllers;

import com.greenfoxacademy.backendtest.models.Appendable;
import com.greenfoxacademy.backendtest.models.Doubling;
import com.greenfoxacademy.backendtest.models.ErrorHandler;
import com.greenfoxacademy.backendtest.models.Greeting;
import com.greenfoxacademy.backendtest.models.NumberObject;
import com.greenfoxacademy.backendtest.models.ResultObject;
import com.greenfoxacademy.backendtest.services.BackEndService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private BackEndService backEndService;

  @Autowired
  public MainController(BackEndService backEndService) {
    this.backEndService = backEndService;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<?> doubling(
      @RequestParam(name = "input", required = false) Integer inputNumber) {
    return backEndService.doubleNumber(inputNumber);
  }

  @GetMapping("/greeter")
  @ResponseBody
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

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public ResponseEntity<Appendable> appendA(@PathVariable String appendable) {
    return new ResponseEntity<>(new Appendable(appendable + "a"),
        HttpStatus.OK);
  }

  //POST /dountil/{action
  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> dountil(@PathVariable String action,
                                   @RequestBody NumberObject number) {
    if (action.equals("sum")) {
      int sumOfNumbers = IntStream
          .range(1, number.until + 1)
          .reduce(0, Integer::sum);
      ResultObject resultObject = new ResultObject(sumOfNumbers);
      return new ResponseEntity<>(resultObject, HttpStatus.OK);
    } else if (action.equals("factor")) {
      int factorOfNumbers = IntStream
          .range(1, number.until + 1)
          .reduce(1, (a, b) -> a * b);
      ResultObject resultObject = new ResultObject(factorOfNumbers);
      return new ResponseEntity<>(resultObject, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new ErrorHandler("Please provide a number!")
          , HttpStatus.BAD_REQUEST);
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
