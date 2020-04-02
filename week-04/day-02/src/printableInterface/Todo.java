package printableInterface;

public class Todo implements Printable {

  private String task;

  public Todo(String task, String priority, boolean isItDone) {
    this.task = task;
    this.priority = priority;
    this.isItDone = isItDone;
  }

  private String priority;
  private boolean isItDone;

  @Override
  public void printAllFields() {
    System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isItDone);
  }
}
