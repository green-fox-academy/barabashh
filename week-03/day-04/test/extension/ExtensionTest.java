package extension;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAdd_2and2is4() {
    assertEquals(4, extension.add(2, 2));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_second() {
    assertEquals(4, extension.maxOfThree(1, 4, 1));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedianWithFourNumbers() {
    assertEquals(5, extension.countMedian(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedianWithFiveNumbers() {
    assertEquals(3, extension.countMedian(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testMedianWithFiveDifferentNumbers() {
    assertEquals(25, extension.countMedian(Arrays.asList(8,29,35,25,21)));
  }

  @Test
  void testMedianWithSixDifferentNumbers() {
    assertEquals(9, extension.countMedian(Arrays.asList(10,2,5,12,11,8)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }
@Test
  void testIsVowel_O() {
    assertTrue(extension.isVowel('O'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}