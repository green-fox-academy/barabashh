package sharpie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharpieTest {
  Sharpie sharpie;

  @BeforeEach
  void setUp() {
    sharpie = new Sharpie("Red", 10.2);
  }

  @Test
  void mustHave100InkAmountWhenCreated() {
    assertEquals(100, sharpie.inkAmount);
  }

  @Test
  void mustDecreaseInkAmountBy1WhenUsed(){
    sharpie.use();
    sharpie.use();
    assertEquals(98,sharpie.inkAmount);
  }
}