package pirates2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  private Pirate captain;
  private List<Pirate> crew = new ArrayList<>();

  public void fillShip() {
    captain = new Pirate();
    Pirate crewPirate = new Pirate();
    Random random = new Random();
    int randNum = random.nextInt(10);
    for (int i = 0; i < randNum; i++) {
      crew.add(crewPirate);
    }
  }

  @Override
  public String toString() {
    String information;
    if (this.captain == null) {
      return "The ship doesn't have a captain yet, please run the fillShip  method";
    } else {
      information = "The captain consumend " + captain.getIntoxication() + " rum\n";
      information += captain.isItDead() ? "The captain is dead\n" : "The captain is alive\n";
      information += captain.isPassedOut() ? "The captain is passed out\n" : "The captain is conscious\n";
    }
    int numOfAliveCrewPirates = 0;
    for (Pirate pirate : crew) {
      if (!pirate.isItDead()) {
        numOfAliveCrewPirates++;
      }
    }
    information += "The ship has " + numOfAliveCrewPirates + " alive Pirates in the crew";
    return information;
  }

  /*public boolean battle(Ship otherShip){

  }
  */

}
