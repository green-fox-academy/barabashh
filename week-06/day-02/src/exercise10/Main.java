package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    Fox fox1 = new Fox("Vuk","red",2);
    Fox fox2 = new Fox("Rusty","blue",20);
    Fox fox3 = new Fox("Jane","green",5);
    Fox fox4 = new Fox("Doe","yellow",7);
    Fox fox5 = new Fox("Alpha","green",3);
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    List<Fox> greenFoxes = foxes
        .stream()
        .filter(f -> f.getColor() == "green")
        .collect(Collectors.toList());

    List<Fox> greenFoxesLessThan5YearsOld = foxes
        .stream()
        .filter(f -> f.getColor() == "green" && f.getAge() < 5)
        .collect(Collectors.toList());

    Map<String,Long> frequencyOfFoxesByColor = foxes
        .stream()
        .collect(Collectors.groupingBy(f -> f.getColor(),Collectors.counting()));
  }
}
