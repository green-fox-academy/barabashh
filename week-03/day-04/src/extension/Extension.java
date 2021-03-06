package extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return Math.max(Math.max(a, b), c);
  }

  int countMedian(List<Integer> numbers) {
    Collections.sort(numbers);
    int lengthOfTheList = numbers.size();
    if (lengthOfTheList % 2 == 0) //list has even number of numbers
    {
      return (numbers.get(lengthOfTheList / 2 - 1) + numbers.get(lengthOfTheList / 2)) / 2;
    } else //list has odd number of numbers
    {
      return numbers.get(lengthOfTheList / 2);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  String translate(String word) {
    int length = word.length();
    for (int i = 0; i < length; i++) {
      char c = word.charAt(i);
      if (isVowel(c)) {
        word = String.join(c + "v" + c, word.split(String.valueOf(c)));
        i += 2;
        length += 2;
      }
    }
    return word;
  }
}
