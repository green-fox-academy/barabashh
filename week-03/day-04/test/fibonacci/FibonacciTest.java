package fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
  Fibonacci fibonacci;

  @Before
  public void setup() {
  fibonacci = new Fibonacci();
  }

  @Test
  public void shouldReturn0AtIndex0() {
    assertEquals(0,fibonacci.countFibonacciAtIndexByAddition(0));
  }

  @Test
  public void shouldReturn1AtIndex1() {
    assertEquals(1,fibonacci.countFibonacciAtIndexByAddition(1));
  }

  @Test
  public void shouldReturn1AtIndex2() {
    assertEquals(1,fibonacci.countFibonacciAtIndexByAddition(2));
  }

  @Test
  public void shouldReturn2AtIndex3() {
    assertEquals(2,fibonacci.countFibonacciAtIndexByAddition(3));
  }

  @Test
  public void shouldReturn34AtIndex9() {
    assertEquals(34,fibonacci.countFibonacciAtIndexByAddition(9));
  }

}