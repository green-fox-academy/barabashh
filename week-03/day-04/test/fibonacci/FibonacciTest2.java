package fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest2 {
  Fibonacci fibonacci;

  @Before
  public void setup() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void shouldReturn1atIndex2() {
    assertEquals(1, fibonacci.countFibonacciAtIndexByAlgorithm(2));
  }
}