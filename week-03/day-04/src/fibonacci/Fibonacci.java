package fibonacci;

public class Fibonacci {
  public long countFibonacciAtIndexByAddition(int index) {
    if (index == 0) {
      return 0;
    }
    if (index == 1) {
      return 1;
    }
    long nMinus2 = 0;
    long nMinus1 = 1;
    long n = 0;
    for (int i = 0; i < index - 1; i++) {
      n = nMinus2 + nMinus1;
      //set the variables at the next place:
      nMinus2 = nMinus1;
      nMinus1 = n;
    }
    return n;
  }

  public long countFibonacciAtIndexByAlgorithm(int index) {
    double goldenRatio = (1 + Math.sqrt(5)) / 2;
    return (long) ((Math.pow(goldenRatio, index) - Math.pow(-(1 - goldenRatio), index)) / Math.sqrt(5));
  }
}

