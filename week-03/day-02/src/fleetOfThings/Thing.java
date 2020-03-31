package fleetOfThings;

public class Thing implements Comparable<Thing> {
  private String desription;
  private boolean completed;

  public Thing(String name) {
    this.desription = name;
  }


  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + desription;
  }

  @Override
  public int compareTo(Thing thingToCompareTo) {
    if (this.completed != thingToCompareTo.completed){
      return Boolean.compare(this.completed, thingToCompareTo.completed);
    }else{
      return this.desription.compareTo(thingToCompareTo.desription);
    }
  }
}
