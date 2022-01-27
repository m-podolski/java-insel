package c7;

import java.util.ArrayList;
import java.util.Objects;

public class Player {

  City location;
  private final ArrayList<Candy> candies = new ArrayList<Candy>(10);
  Candy candy;

  public void buy(Candy newCandy) {
    candies.add(Objects.requireNonNull(newCandy));
  }

  public boolean eat(String name) {
    for (int i = 0; i < candies.size(); i++)
      if (candies.get(i).name.equals(name)) {
        candies.remove(i);
        return true;
      }
    return false;
  }

  public void listCandies() {
    int sum = 0;
    for (Candy candy : candies) {
      System.out.println(candy);
      sum += candy.calories;
    }
    System.out.printf("Summe aller Kalorien: %d%n", sum);
  }

  void travelTo(City newLocation) {
    this.location = newLocation;
  }

  void moveTo(City city) {
    if (location.name.equalsIgnoreCase(city.name)) {
      System.out.println("Du bist doch schon da! ( _ )");
      return;
    }
    RandomGameEvents.next().process(this);
    location = city;
  }
}
