package c12;

public class PlayerRocketDemo {

  public static void main(String[] args) {
    Player michael = new Player();
    michael.name = "Omar Arnold";
    Rocket rocket = new Rocket();
    Long aBigNumber = 11111111111111L;

    rocket.set(aBigNumber); // (1)
    michael.leftRocket = rocket;
    michael.rightRocket = new Rocket(2222222222222222222L);
    System.out.println(michael.name + " transportiert in der Rakete " +
      michael.leftRocket.get() + " und " + michael.rightRocket.get());

    Long val1 = (Long) michael.leftRocket.get(); // (2)
    Long val2 = (Long) michael.rightRocket.get();
    System.out.println(val1.compareTo(val2) > 0 ? "Links" : "Rechts");

    Rocket<Integer> intRocket = new Rocket<Integer>();
    Rocket<String> stringRocket = new Rocket<String>();

    intRocket.set(1);
    int x = intRocket.get(); // Keine Typumwandlung mehr nötig
    stringRocket.set("Selbstzerstörungsauslösungsschalterhintergrundbeleuchtung");
    String s = stringRocket.get();

    Rocket<Rocket<String>> rocketOfRockets = new Rocket<Rocket<String>>();
    rocketOfRockets.set(new Rocket<String>());
    rocketOfRockets.get().set("Inner Rocket<String>");
    System.out.println(rocketOfRockets.get().get()); // Inner Rocket<String>
  }
}
