package flyable;

public class Helicopter extends Vehicle implements Flyable{
  @Override
  public void land() {
    System.out.println("Land");
  }

  @Override
  public void fly() {
    System.out.println("Fly");

  }

  @Override
  public void takeOff() {
    System.out.println("Take Off");
  }
}
