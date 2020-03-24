package farm;

import animal.Animal;
import java.util.ArrayList;

public class Farm {
  ArrayList<Animal> animals = new ArrayList<>();
  int slots;

  public Farm(int slots) {
    this.slots = slots;
  }

  public void breed() {
    if (slots > 0) {
      Animal animal = new Animal();
      animals.add(animal);
      slots--;
    }else
    {
      System.out.println("The farm is full, there are no more free slots!");
    }
  }

  public void slaughter() {
    int minHunger = Integer.MAX_VALUE;
    for (Animal animal : animals) {
      if (animal.hunger < minHunger) {
        minHunger = animal.hunger;
      }
    }
    for (Animal animal : animals) {
      if (animal.hunger == minHunger) {
        animals.remove(animal);
        slots++;
        break;  //if there are more than one equally (not) hungry animals,
        // slaughter only one of them
      }
    }
  }
}
