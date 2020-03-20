package fibonacci;

public class Fibonacci {
  public int countFibonacciAtIndexByAddition(int index) {
    if (index == 0) {
      return 0;
    }
    if (index == 1) {
      return 1;
    }
    int nMinus2 = 0;
    int nMinus1 = 1;
    int n = 0;
    for (int i = 0; i < index - 1; i++) {
      n = nMinus2 + nMinus1;
      //set the variables at the next place:
      nMinus2 = nMinus1;
      nMinus1 = n;
    }
    return n;
  }
}
