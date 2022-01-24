package c6;

public class Candy {

  public Candy() {
  }

  public Candy(Candy other) {
    this.name = other.name;
    this.price = other.price;
    this.quantity = other.quantity;
  }

  private String name;
  private int price;
  private int quantity;

  public static void main(String[] args) {
    Candy caramel = new Candy();
    caramel.name = "Caramel Pops";
    caramel.price = 20;
    Candy caramelPops = new Candy(caramel);
    System.out.printf("%s %d%n", caramelPops.name, caramelPops.price);
  }

  public boolean hasSameName(Candy that) {
    return this.name.equals(that.name);
  }

  Candy name(String name) {
    this.name = name;
    return this;
  }

  String name() {
    return name;
  }

  Candy price(int price) {
    this.price = price;
    return this;
  }

  int price() {
    return price;
  }

  int totalPrice() {
//    int price = quantity * this.price;
//    return price;
    return price * quantity;
  }

  void resetQuantity() {
    quantity = 1;
  }

  public void setName(String name) {
    if (name != null && !name.trim().isEmpty()) {
      this.name = name;
    }
  }

  public String getName() {
    return name;
  }

  public void setPrice(int price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public int getPrice() {
    return price;
  }

  public void setQuantity(int quantity) {
    if (quantity >= 1) {
      this.quantity = quantity;
    }
  }

  public int getQuantity() {
    return quantity;
  }
}
