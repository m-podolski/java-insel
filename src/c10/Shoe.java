package c10;

public class Shoe {

  void out() {
    System.out.println("Ich bin der Schuh des Manitu.");
  }

  class LeatherBoot extends Shoe {

    void what() {
      Shoe.this.out();
    }

    @Override
    void out() {
      System.out.println("Ich bin ein Shoe.LeatherBoot.");
    }
  }

  public static void main(String[] args) {
    (new Shoe()).new LeatherBoot().what();
  }
}
