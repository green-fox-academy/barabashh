package printableInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    List<Todo> todos = new ArrayList<>();
    Domino domino1 = new Domino(2,4);
    Domino domino2 = new Domino(1,6);
    dominoes.add(domino1);
    dominoes.add(domino2);

    Todo todo1 = new Todo("Pass the exam","high",false);
    Todo todo2 = new Todo("Run in sunshine","high",true);
    todos.add(todo1);
    todos.add(todo2);

    for (Domino d : dominoes) {
      d.printAllFields();
    }

    for (Todo t : todos) {
      t.printAllFields();
    }
  }
}
