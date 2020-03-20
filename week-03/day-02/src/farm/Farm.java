package farm;

import animal.Animal;
import java.util.ArrayList;

public class Farm {
  ArrayList<Animal> animals = new ArrayList<>();
  int slots = 2;
  public void breed(){
    if (slots > 0){
      Animal animal = new Animal();
      animals.add(animal);
    }
  }
  public void slaughter(){
    int minHunger = Integer.MAX_VALUE;
    for (Animal animal: animals) {
      //if(animal.h)
    }
  }
}
