package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String species) {
    super(species);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }
}
