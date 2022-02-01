package c10;

class FurnishedHouse {

  String s = "House";

  class Room {

    String s = "Room";

    class Chair {

      String s = "Chair";

      void output() {
        System.out.println(s); // Chair
        System.out.println(this.s); // Chair
        System.out.println(Chair.this.s); // Chair
        System.out.println(Room.this.s); // Room
        System.out.println(FurnishedHouse.this.s); // House
      }
    }
  }

  public static void main(String[] args) {
    new FurnishedHouse().new Room().new Chair().output();

    FurnishedHouse h = new FurnishedHouse(); // Exemplar von FurnishedHouse
    FurnishedHouse.Room r = h.new Room(); // Exemplar von Room in h
    FurnishedHouse.Room.Chair c = r.new Chair(); // Exemplar von Chair in r
    c.output(); // Methode von Chair
  }
}
