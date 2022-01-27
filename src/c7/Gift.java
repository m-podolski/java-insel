package c7;

import java.util.concurrent.ThreadLocalRandom;

class Gift extends Event {

  @Override protected void process(Player player) {
    System.out.println("Du Glückspilz! Jemand schenkt dir Süßigkeiten.");
    player.candy.quantity += ThreadLocalRandom.current().nextInt(1, 10);
  }
}