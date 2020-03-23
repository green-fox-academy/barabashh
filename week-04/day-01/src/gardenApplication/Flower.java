package gardenApplication;

import java.awt.Color;

public class Flower {
  String color;
  public double waterLevel;
  private double minWaterAmount = 5;

  public boolean needsWater() {
    return waterLevel < minWaterAmount;
  }

  public Flower(String color) {
    this.color = color;
  }
}
