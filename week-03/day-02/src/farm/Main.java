package farm;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm(3);

    for (int i = 0; i < 5; i++) {
      farm.breed();
    }
    farm.animals.get(1).drink();
    farm.animals.get(2).drink();
    farm.animals.get(2).drink();
    farm.animals.get(1).eat();

    farm.slaughter();
  }
}
