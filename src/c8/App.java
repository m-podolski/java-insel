package c8;

import c8.interfaces.Bike;
import c8.interfaces.Buyable;
import c8.interfaces.MuseumVisit;

public class App {

  public static void main(String[] args) {
    Buyable hercules = new Bike();
    Buyable binarium = new MuseumVisit(8);
    System.out.println(hercules.price()); // 199.0
    System.out.println(binarium.price()); // 8.0
  }
}
