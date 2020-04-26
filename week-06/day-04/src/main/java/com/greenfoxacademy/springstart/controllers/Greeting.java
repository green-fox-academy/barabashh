package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  public long greetCount;
  public String content;

  public Greeting(long greetCount, String content) {
    this.greetCount = greetCount;
    this.content = content;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public String getContent() {
    return content;
  }

}
