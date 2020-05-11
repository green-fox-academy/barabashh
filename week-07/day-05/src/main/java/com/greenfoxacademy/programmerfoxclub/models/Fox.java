package com.greenfoxacademy.programmerfoxclub.models;

import java.util.List;

public class Fox {

  public enum Drink {
    LEMONADE,
    WATER
  }

  public enum Food {
    PIZZA,
    SALAD
  }

  private String name;
  private List<String> tricks;
  private Food food;
  private Drink drink;

  public Fox(String name, List<String> tricks, Food food, Drink drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public Food getFood() {
    return food;
  }

  public Drink getDrink() {
    return drink;
  }
}
