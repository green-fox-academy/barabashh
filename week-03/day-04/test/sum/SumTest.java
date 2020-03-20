package sum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
  Sum sum;

  @Before
  public  void setup(){
    sum = new Sum();
  }

  @Test
  public void addSimpleNumbers() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(10, 20, 10, 10));
    assertEquals(50, sum.sum(testList));
  }

  @Test
  public void addEmptyList() {
    ArrayList<Integer> testList = new ArrayList<Integer>();
    assertEquals(0, sum.sum(testList));
  }

  @Test
  public void addOneElement() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(10));
    assertEquals(10, sum.sum(testList));
  }

  @Test
  public void addMultipleElementsIncludingNegative() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(-10,-20,10,20));
    assertEquals(0, sum.sum(testList));
  }

  @Test
  public void addListOfNulls() {
    ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(0,0,0,0));
    assertEquals(0, sum.sum(testList));
  }
}