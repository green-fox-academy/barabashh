package anagram;

import java.util.Arrays;

public class Anagram {
  public boolean areTheyAnagrams(String word1, String word2){
    char[] charFromWord1 = word1.toCharArray();
    char[] charFromWord2 = word2.toCharArray();
    Arrays.sort(charFromWord1);
    Arrays.sort(charFromWord2);
    return Arrays.equals(charFromWord1, charFromWord2);
  }
}
