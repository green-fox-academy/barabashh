package animal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
  Animal animal;

  @BeforeEach
  void setUp() {
    animal = new Animal();
  }

  @Test
  void hungerAndThirstMustBe50WhenCreated() {
    assertEquals(50, animal.hunger);
    assertEquals(50, animal.thirst);
  }

  @Test
  void eatMustDecreaseHungerByOne() {
    animal.eat();
    assertEquals(49, animal.hunger);
  }

  @Test
  void drinkMustDecreaseThirstByOne() {
    animal.drink();
    assertEquals(49, animal.thirst);
  }

  @Test
  void playMustIncreaseThirstAndHungerByOne() {
    animal.play();
    assertEquals(51, animal.thirst);
    assertEquals(51, animal.hunger);
  }
}