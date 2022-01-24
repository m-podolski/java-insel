package c6;

public class LateConstant {

  public static final int HUBBLE;
  public final String ISBN;

  static {
    try (java.util.Scanner scanner = new java.util.Scanner(
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
