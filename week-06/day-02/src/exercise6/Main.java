package exercise6;

public class Main {
  public static void main(String[] args) {
    String test = "aPPleWorm";
    test.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> Character.isUpperCase(c))
        .forEach(System.out::println);
  }
}
