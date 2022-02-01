package c10;

public class Lamp {

  static String name = "Latifa";
  int watt = 1985;

  static class Bulb {

    void output() {
      System.out.println(name);
//      System.out.println(watt); // Cannot make a static reference to the non-static field watt
    }
  }

  public static void main(String[] args) {
    Bulb bulb = new Lamp.Bulb(); // oder Lamp.Bulb bulb = ...
    bulb.output();
  }
}
