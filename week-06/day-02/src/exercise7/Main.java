package exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
        "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    System.out.println(findStringsWithStartingLetter(cities, "N"));
  }

  public static List<String> findStringsWithStartingLetter(List<String> inputStringList, String startingLetter) {
    return inputStringList.stream().filter(s -> s.startsWith(startingLetter)).collect(Collectors.toList());
  }
}
