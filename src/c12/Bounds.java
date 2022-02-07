package c12;

public class Bounds {

  public static <T extends CharSequence> T random(T m, T n) {
    return Math.random() > 0.5 ? m : n;
  }

  public static <T extends Comparable<T>> T max(T m, T n) {
    return m.compareTo(n) > 0 ? m : n;
  }

  public static void main(String[] args) {
    String random1 = random("Shinju", "Karada");
    System.out.println(random1);
    CharSequence random2 = random("Ushiro", new StringBuilder("Takatekote"));
    System.out.println(random2);

    System.out.println(max("Kino", "Lesen")); // Lesen
    System.out.println(max(12, 100)); // 100
  }
}
