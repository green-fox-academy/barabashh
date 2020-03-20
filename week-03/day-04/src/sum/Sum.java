package sum;

import java.util.ArrayList;

public class Sum {
  public int sum(ArrayList<Integer> numbers) {
    int sum = 0;
    for (Integer objInt : numbers) {
      sum += objInt;
    }
    return sum;
  }
}
