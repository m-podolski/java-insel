package c8.interfaces;

import c7.Event;
import c7.Player;

import java.util.Arrays;

class Flight extends Event implements Buyable, Comparable<Flight> {

  final double ticketPrice;

  Flight(int ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  @Override public double price() {
    return ticketPrice;
  }

  @Override public int compareTo(Flight other) {
    return Double.compare(ticketPrice, other.ticketPrice);
  }

  @Override protected void process(Player player) {

  }

  public static void main(String[] args) {
    Flight londonToDurban = new Flight(1200);
    System.out.println(londonToDurban instanceof Flight); // true
    System.out.println(londonToDurban instanceof Event); // true
    System.out.println(londonToDurban instanceof Object); // true
    System.out.println(londonToDurban instanceof Buyable); // true
    System.out.println(londonToDurban instanceof Comparable); // true

    Flight dortmundToBrussels = new Flight(200);
    System.out.println(londonToDurban.compareTo(londonToDurban)); // 0
    System.out.println(londonToDurban.compareTo(dortmundToBrussels)); // 1
    System.out.println(dortmundToBrussels.compareTo(londonToDurban)); //-1
    System.out.println(dortmundToBrussels.compareTo(dortmundToBrussels));// 0

    Flight berlinToNairobi = new Flight(1500);
    Flight duesseldorfToWindhoek = new Flight(1400);
    Flight[] flights = {
      londonToDurban, dortmundToBrussels, berlinToNairobi, duesseldorfToWindhoek
    };
    Arrays.sort(flights);
    for (Flight flight : flights)
      System.out.print((int) flight.price() + " "); // 200 1200 1400 1500
  }
}
