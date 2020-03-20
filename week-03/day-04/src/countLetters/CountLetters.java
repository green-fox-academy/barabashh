package countLetters;

import java.util.ArrayList;
import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters(String word) {
    ArrayList<Character> chars = new ArrayList<>();
    for (char ch : word.toCharArray()) {
      chars.add(ch);
    }
    HashMap<Character, Integer> lettersMap = new HashMap<>();
    for (char ch : chars) {
      if (lettersMap.containsKey(ch)) {
        int currentCount = lettersMap.get(ch);
        lettersMap.put(ch, ++currentCount);
      } else {
        lettersMap.put(ch, 1);
      }
    }
    return lettersMap;
  }
}