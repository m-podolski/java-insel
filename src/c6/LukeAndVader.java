package c6;

public class LukeAndVader {

  public static void main(String[] args) {

    Luke luke = new Luke();
    Darth vader = new Darth();
    System.out.println(luke.dad); // null
    vader.revealTruthTo(luke);
    System.out.println(luke.dad); // com.tutego.insel.oop.Darth@01234567
  }
}

class Luke {
  Darth dad;
}

class Darth {
  void revealTruthTo(Luke son) {
    son.dad = this;
  }
}

