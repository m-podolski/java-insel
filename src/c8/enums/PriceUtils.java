package c8.enums;

import c8.interfaces.Bike;
import c8.interfaces.Buyable;
import c8.interfaces.MuseumVisit;

public class PriceUtils {

  static double calculateSum(Buyable first, Buyable... more) {
    double result = first.price();
    for (Buyable buyable : more)
      result += buyable.price();
    return result;
  }

  public static boolean hasPrice(Buyable b) {
    return b.price() > 0;
  }

  public static double priceOr(Buyable b, double defaultPrice) {
    if (b != null && b.price() > 0) {
      return b.price();
    }
    return defaultPrice;
  }

  public static void main(String[] args) {
    Bike hercules = new Bike();
    MuseumVisit binarium = new MuseumVisit(8);
    Buyable winora = new Bike();
    Buyable mimomenta = new MuseumVisit(12);
    double sum = calculateSum(hercules, binarium, winora, mimomenta);
    System.out.println(sum); // 418.0
  }
}
