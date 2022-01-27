package c7;

public class Mugging extends Event {

  @Override protected void process(Player player) {
    System.out.println("Hilfe! Jemand klaut dir alle Süßigkeiten.");
    player.candy.quantity = 0;
  }
}
