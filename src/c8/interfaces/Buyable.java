package c8.interfaces;

import c8.enums.PriceUtils;

public interface Buyable {

  /* public static final */ int MAX_PRICE = 10_000_000;

  static boolean isValidPrice(double price) {
    return price >= 0 && price < MAX_PRICE;
  }

  double price();

//  default boolean hasPrice() {
//    return price() > 0;
//  }

  default boolean hasPrice() {
    return PriceUtils.hasPrice(this);
  }

  default double priceOr(double defaultPrice) {
    return PriceUtils.priceOr(this, defaultPrice);
  }
}
