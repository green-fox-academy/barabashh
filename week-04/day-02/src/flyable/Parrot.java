package flyable;

import main.java.animals.Bird;

public class Parrot extends Bird implements Flyable{
  public Parrot(String species) {
    super(species);
  }

  @Override
  public void land() {
    System.out.println("land");
  }

  @Override
  public void fly() {
    System.out.println("fly");
  }

  @Override
  public void takeOff() {
    System.out.println("takeOff");
  }
}
