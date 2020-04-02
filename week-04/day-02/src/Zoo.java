import main.java.animals.*;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getSpecies() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getSpecies() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getSpecies() + " is breeding by " + bird.breed());
  }
}