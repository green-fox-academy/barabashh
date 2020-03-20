package anagram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
  Anagram anagram;

  @Before
  public void setup() {
    anagram = new Anagram();
  }

  @Test
  public void differentLengthsWordsExpectedFalse() {
    assertEquals(false,anagram.areTheyAnagrams("apple","orange"));
  }

  @Test
  public void sameLengthsNotAnagramWordsExpectedFalse() {
    assertEquals(false,anagram.areTheyAnagrams("tomato","orange"));
  }

  @Test
  public void sameLengthsAnagramWordsExpectedTrue() {
    assertEquals(true,anagram.areTheyAnagrams("dormitory","dirtyroom"));
  }
}