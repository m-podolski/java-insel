package c6;

import java.util.Scanner;

public class LateConstant {

  public static final int HUBBLE;
  public final String ISBN;

  static {
    try (Scanner scanner = new Scanner(
      LateConstant.class.getResourceAsStream("../resources/Constant.txt"))) {
      HUBBLE = scanner.nextInt();
    }
  }

  public LateConstant() {
    ISBN = "3572100100";
  }

  public static void main(String[] args) {
    System.out.println(HUBBLE); // 72
    System.out.println(new LateConstant().ISBN); // 3572100100
  }
}
