package sharpieSet;

import java.util.ArrayList;
import sharpie.Sharpie;

public class SharpieSet {
  ArrayList<Sharpie> sharpieSet = new ArrayList<Sharpie>();

  public void add(Sharpie sharpie) {
    sharpieSet.add(sharpie);
  }

  public int countUsable() {
    int numUsable = 0;
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount > 0) {
        numUsable++;
      }
    }
    return numUsable;
  }

  public void removeTrash() {
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount <= 0) {
        sharpieSet.remove(sharpie);
      }
    }
  }
}
