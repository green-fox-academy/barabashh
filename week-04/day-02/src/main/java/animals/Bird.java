package main.java.animals;

public class Bird extends Animal {

  public Bird(String species) {
    super("Bird");
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
