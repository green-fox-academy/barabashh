package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    OptionalDouble avg = numbers.stream()
        .filter(n -> n%2 != 0)
        .mapToInt(Integer::intValue)
        .average();
    System.out.println(avg);
  }
}
