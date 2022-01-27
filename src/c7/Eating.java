package c7;

class Eating extends Event {

  @Override protected void process(Player player) {
    System.out.println("Du hast Hunger und isst einige deiner Süßigkeiten.");
    player.candy.quantity *= Math.random();
  }
}
