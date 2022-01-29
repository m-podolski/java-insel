package c8.enums;

public enum Country {
  GERMANY, UK, CHINA;

  static {
    System.out.println("Klasseninitialisierer");
  }

  {
    System.out.println("Objektinitialisierer");
  }

  private Country() {
    System.out.println("Konstruktor");
  }

  public String getISO3Country() {
    return switch (this) {
      case GERMANY -> "DEU";
      case UK -> "GBR";
      default -> "CHN";
    };
  }

  public static void main(String[] args) {
    System.out.println(GERMANY);
  }
}
