package sharpie;

public class Sharpie {
  String color;
  double width;
  double inkAmount = 100;

  Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    inkAmount--;
  }
}
