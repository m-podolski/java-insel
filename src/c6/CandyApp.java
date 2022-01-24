package c6;

public class CandyApp {

  public static void main(String[] args) {

//    Candy lollipop = new Candy();
//    lollipop.name = "Lollipop";
//    lollipop.price = 12;
//    lollipop.quantity = 2;
//    Candy licorice = new Candy();
//    licorice.name = "Licorice";
//    licorice.price = 22;
//
//    System.out.printf("%s, %d × %d = %d%n", // Lollipop, 2 × 12 = 24
//      lollipop.name, lollipop.quantity, lollipop.price,
//      lollipop.quantity * lollipop.price);
//    System.out.printf("%s, %d × %d = %d%n", // Licorice, 0 × 22 = 0
//      licorice.name, licorice.quantity, licorice.price,
//      licorice.quantity * licorice.price);
//
//    System.out.println(lollipop.totalPrice()); // 24
//    lollipop.resetQuantity();
//    System.out.println(lollipop.totalPrice()); // 12

    Candy lollipop = new Candy();
    lollipop.setPrice(12);
    System.out.println(lollipop.getPrice() * lollipop.getQuantity());
  }
}
