package main.java.animals;

public abstract class Animal {
  private String species;
  private int age;

  public Animal(String species) {
    this.species = species;
  }

  public String getSpecies() {
    return species;
  }

  public abstract String breed();
}
