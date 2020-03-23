package gardenApplication;

import java.awt.Color;

public class Tree {
  String color;
  public double waterLevel;
  private double minWaterAmount = 10;

  public boolean needsWater() {
    return waterLevel < minWaterAmount;
  }

  public Tree(String color) {
    this.color = color;
  }
}
