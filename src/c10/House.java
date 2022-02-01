package c10;

class House {

  private String owner = "Ich";

  class Room {

    void ok() {
      System.out.println(owner);
    }
// static void error() { }
  }

  public static void main(String[] args) {
    House h = new House();
    Room r = h.new Room();
//    Oder auch in einer Zeile:
    Room q = new House().new Room();
  }
}
