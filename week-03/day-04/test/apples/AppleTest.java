package apples;

import static org.junit.Assert.*;

public class AppleTest {
  Apple apple = new Apple();

  @org.junit.Test
  public void getApple() {
    assertEquals("apple", apple.getApple());
  }
}