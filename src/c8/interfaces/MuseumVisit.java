package c8.interfaces;

import c7.Event;
import c7.Player;

public class MuseumVisit extends Event implements Buyable {

  int price;

  public MuseumVisit(int price) {
    this.price = price;
  }

  @Override public double price() {
    return price;
  }

  @Override protected void process(Player player) {

  }
}
