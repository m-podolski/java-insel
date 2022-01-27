package c7;

import java.util.Scanner;

public class Playground {

  public static void main(String[] args) {

    Candy liquorice = new Candy("Liquorice", 100);
    liquorice.quantity = 10;
    Player peter = new Player();
    peter.candy = liquorice;
    peter.location = new City("Dortmund");
    Event mugging = new Mugging();
    Event gift = new Gift();

//    System.out.println(peter.candy.quantity); // 10
//    mugging.process(peter);
//    System.out.println(peter.candy.quantity); // 0
//    gift.process(peter);
//    System.out.println(peter.candy.quantity); // 7

    System.out.println("Gib das Ziel ein, wohin du reisen möchtest. " +
      "Eine Leereingabe beendet das Spiel.");

    while (true) {
      System.out.printf("Du bist aktuell in %s und besitzt %d '%s'%n",
        peter.location, peter.candy.quantity, peter.candy.name);
      System.out.print("Ziel: ");
      String input = new Scanner(System.in).nextLine();
      if (input.trim().isEmpty()) break;
//      peter.moveTo(input);
    }
  }
}
