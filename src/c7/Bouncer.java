package c7;

class Bodybuilder {

  Bodybuilder() {
    whoAmI();
  }

  void whoAmI() {
    System.out.println("Ich weiß es noch nicht :-(");
  }
}

public class Bouncer extends Bodybuilder {

  String who = "Monkey Man";

//  Bouncer() {
//    super();
//    who = "Monkey Man";
//  }

  @Override void whoAmI() {
    System.out.println(who);
  }

  public static void main(String[] args) {
    Bodybuilder bb = new Bodybuilder();
    bb.whoAmI();
    Bouncer bouncer = new Bouncer();
    bouncer.whoAmI();
  }
}
