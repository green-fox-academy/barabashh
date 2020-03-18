package fleetOfThings;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    Thing third = new Thing("Stand up");
    third.complete();
    Thing fourth = new Thing("Eat lunch");
    fourth.complete();
    fleet.add(third);
    fleet.add(fourth);
    System.out.println(fleet.toString());
  }
}