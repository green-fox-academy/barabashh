package gardenApplication;

import java.util.ArrayList;

public class Garden {
  ArrayList<Flower> flowers;
  ArrayList<Tree> trees;

  public Garden() {
    flowers = new ArrayList<>();
    trees = new ArrayList<>();
  }

  public void add(Flower flower) {
    flowers.add(flower);
  }

  public void add(Tree tree) {
    trees.add(tree);
  }

  public void printStatus() {
    for (Flower flower : this.flowers) {
      if (flower.needsWater()) {
        System.out.println("The " + flower.color + " Flower needs water");
      }else{
        System.out.println("The " + flower.color + " Flower doesnt need water");
      }
    }
    for (Tree tree : this.trees) {
      if (tree.needsWater()) {
        System.out.println("The " + tree.color + " Tree needs water");
      }else{
        System.out.println("The " + tree.color + " Tree doesnt need water");
      }
    }
    System.out.println();
  }

  public void water(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    double numberOfPalntsNeedWatering = 0;
    for (Flower flower : this.flowers) {
      if (flower.needsWater()) {
        numberOfPalntsNeedWatering++;
      }
    }
    for (Tree tree : this.trees) {
      if (tree.needsWater()) {
        numberOfPalntsNeedWatering++;
      }
    }
    double waterAmountPerPlant = waterAmount / numberOfPalntsNeedWatering;

    //watering flowers:
    for (Flower flower : this.flowers) {
      if (flower.needsWater()) {
        flower.waterLevel += waterAmountPerPlant * 0.75;
      }
    }

    //watering trees:
    for (Tree tree : this.trees) {
      if (tree.needsWater()) {
        tree.waterLevel += waterAmountPerPlant * 0.4;
      }
    }

  }

}
