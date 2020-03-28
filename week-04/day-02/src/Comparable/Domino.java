package Comparable;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino dominoToCompareTo) {
    if (this.getLeftSide() != dominoToCompareTo.getLeftSide()){
      return Integer.compare(this.getLeftSide(), dominoToCompareTo.getLeftSide());
    }else{
      return Integer.compare(this.getRightSide(), dominoToCompareTo.getRightSide());
    }
  }
}