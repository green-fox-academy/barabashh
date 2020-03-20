package countLetters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {
  CountLetters countLetters;

  @Before
  public void setup() {
    countLetters = new CountLetters();
  }

  @Test
  public void shoudCreateMapFromSimpleWord() {
    HashMap<Character, Integer> testResult = new HashMap<>();
    testResult.put('A', 1);
    testResult.put('p', 2);
    testResult.put('l', 1);
    testResult.put('e', 1);
    assertEquals(testResult, countLetters.countLetters("Apple"));
  }

  @Test
  public void shoudCreateMapFromLongerWord() {
    HashMap<Character, Integer> testResult = new HashMap<>();
    testResult.put('R', 1);
    testResult.put('e', 1);
    testResult.put('s', 2);
    testResult.put('p', 1);
    testResult.put('o', 1);
    testResult.put('n', 1);
    testResult.put('i', 3);
    testResult.put('b', 1);
    testResult.put('l', 1);
    testResult.put('t', 1);
    testResult.put('y', 1);
    assertEquals(testResult, countLetters.countLetters("Responsibility"));
  }

  @Test
  public void shoudReturnEmptyMapFromEmptyString() {
    HashMap<Character, Integer> testResult = new HashMap<>();
    assertEquals(testResult, countLetters.countLetters(""));
  }
}