package c6;

public class RollerCoaster {

  private static int numberOfInstances;

  static {
    numberOfInstances++;
  }

  public static int getNumberOfInstances() {
    return numberOfInstances;
  }

  public static void main(String[] args) {
    new RollerCoaster();
    new RollerCoaster();
    System.out.println(RollerCoaster.getNumberOfInstances()); // 2
  }
}
