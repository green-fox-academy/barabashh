package gardenApplication;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");

    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");

    Garden garden = new Garden();
    garden.add(yellow);
    garden.add(blue);
    garden.add(purple);
    garden.add(orange);
    garden.printStatus();

    garden.water(40);
    garden.printStatus();

    garden.water(70);
    garden.printStatus();
  }
}
