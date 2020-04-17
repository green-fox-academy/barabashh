package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  private AtomicLong greetCount = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    Greeting greeting = new Greeting(greetCount.incrementAndGet(), "Hi " + name + "!");
    return greeting;
  }
}
