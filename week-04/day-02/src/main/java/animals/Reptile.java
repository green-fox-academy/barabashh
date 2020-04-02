package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String species) {
    super(species);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
