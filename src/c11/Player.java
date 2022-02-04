package c11;

import java.util.Objects;

public class Player implements Cloneable {

  public String name;
  public int age;
  double weight;

  @Override
  public Player clone() {
    try {
      return (Player) super.clone();
    } catch (CloneNotSupportedException e) {
// Kann eigentlich nicht passieren, da Cloneable
      throw new InternalError();
    }
  }

  /**
   * Returns a hash code value for this {@code Player} object.
   * * @return A hash code value for this object.
   * *
   * * @see java.lang.Object#equals(java.lang.Object)
   * * @see java.util.HashMap
   */
  @Override public int hashCode() {
    int result = 31 + age;
    result = 31 * result + ((name == null) ? 0 : name.hashCode());
    long temp = Double.doubleToLongBits(weight);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  /**
   * Determines whether or not two players are equal. Two instances of
   * {@code Player} are equal if the values of their {@code name}, {@code age}
   * and {@code weight} member fields are the same.
   *
   * @param that an object to be compared with this {@code Player}
   * @return {@code true} if the object to be compared is an instance of
   * {@code Player} and has the same values; {@code false} otherwise.
   */
  @Override
  public boolean equals(Object that) {
    if (this == that) {
      return true;
    }
    if (that == null) {
      return false;
    }
    if (getClass() != that.getClass()) {
      return false;
    }
    Player other = (Player) that;
    if (age != other.age) {
      return false;
    }
    if (Double.compare(weight, other.weight) != 0) {
      return false;
    }
    if (!Objects.equals(name, other.name)) {
      return false;
    }

    if (name == null) {
      if (((Player) that).name != null) {
        return false;
      } else {
        return name.equals(((Player) that).name);
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Player holly = new Player();
    holly.age = 29;
    holly.name = "Susi";
    Player dolly = holly.clone();
    System.out.println(dolly.name + " ist " + dolly.age);

    Player bruceWants = new Player();
    bruceWants.name = "Bruce Wants";
    bruceWants.age = 32;
    bruceWants.weight = 70.3;
    Player bruceLii = new Player();
    bruceLii.name = "Bruce Lii";
    bruceLii.age = 32;
    bruceLii.weight = 70.3;

    System.out.println(bruceWants.hashCode()); // -340931147
    System.out.println(bruceLii.hashCode()); // 301931244
    System.out.println(System.identityHashCode(bruceWants)); // 1671711
    System.out.println(System.identityHashCode(bruceLii)); // 11394033
    System.out.println(bruceLii.equals(bruceWants)); // false
    bruceWants.name = "Bruce Lii";
    System.out.println(bruceWants.hashCode()); // 301931244
    System.out.println(bruceLii.equals(bruceWants)); // true
  }
}
