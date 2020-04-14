package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Character> chars = Arrays.asList('T', 'e', 's', 't', 'i', 'n', 'g');
    String result = chars.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());

    System.out.println(result);
  }
}
