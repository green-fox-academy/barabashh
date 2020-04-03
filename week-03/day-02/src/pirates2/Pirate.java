package pirates2;

import java.util.Random;

public class Pirate {
  private int intoxication;
  private boolean isItDead;
  private boolean isPassedOut;

  public void drinkSomeRum() {
    if (isItDead) {
      System.out.println("he's dead");
    } else {
      intoxication++;
    }
  }

  public void howsItGoingMate() {
    if (isItDead) {
      System.out.println("he's dead");
    } else {
      if (intoxication <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        isPassedOut = true;
        intoxication = 0;
      }
    }
  }

  public void die() {
    isItDead = true;
  }

  public int getIntoxication() {
    return intoxication;
  }

  public boolean isItDead() {
    return isItDead;
  }

  public boolean isPassedOut() {
    return isPassedOut;
  }

  public void brawl(Pirate enemy) {
    Random random = new Random();
    int chance = random.nextInt(3);
    if (chance == 0) {
      this.die();
    } else if (chance == 2) {
      enemy.die();
    } else {
      this.isPassedOut = true;
      enemy.isPassedOut = true;
    }
  }

}
