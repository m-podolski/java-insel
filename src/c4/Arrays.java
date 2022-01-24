package c4;

public class Arrays {

  //  static double avg(double[] array) {
  static double avg(double... array) {
    if (array == null || array.length == 0)
      throw new IllegalArgumentException("Array null oder leer");

    double sum = 0;
    for (double v : array) sum += v;
    return sum / array.length;
  }

  public static void main(String[] args) {
    double[] numbers = {2, 3, 4};
    System.out.println(avg(numbers)); // 3.0
  }
}
