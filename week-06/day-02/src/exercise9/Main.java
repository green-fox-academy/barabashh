package exercise9;

import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    String string = "appleAlphaPhantom";
    Map<Character, Long> charsByFrequency =
        string.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    //solution II:
    Map<Character, Integer> frequencies = string.chars()
        .mapToObj(c -> (char) c)
        .collect(toMap(c -> c,
            v -> 1,
            Integer::sum));
    System.out.println("Frequencies:\n" + frequencies);
  }
}
