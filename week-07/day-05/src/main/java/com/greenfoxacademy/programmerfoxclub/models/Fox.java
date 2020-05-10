package com.greenfoxacademy.programmerfoxclub.models;

import java.util.List;

public class Fox {

  public enum Drink {
    LEMONADE,
    WATER
  }

  private String name;
  private List<String> tricks;
  private String food;
  private Drink drink;

  public Fox(String name, List<String> tricks, String food, Drink drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }
}
