package sharpieSet;

import sharpie.Sharpie;

public class Main {
  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    Sharpie sharpie1 = new Sharpie("Black",10.2);
    Sharpie sharpie2 = new Sharpie("Blue",5.2);
    Sharpie sharpie3 = new Sharpie("Red",4.3);
    for (int i = 0; i < 101; i++) {
      sharpie2.use();
    }
    sharpieSet.add(sharpie1);
    sharpieSet.add(sharpie2);
    sharpieSet.add(sharpie3);
    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
  }
}
