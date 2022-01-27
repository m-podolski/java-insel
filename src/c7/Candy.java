package c7;

import java.util.Objects;

public class Candy {

  public final String name;
  public final int calories;
  public int quantity = 0;
  Player player;

  public Candy(String name, int calories) {
    this.name = Objects.requireNonNull(name);
    this.calories = calories;
  }

  @Override
  public String toString() {
    return name + ", " + calories;
  }
}
