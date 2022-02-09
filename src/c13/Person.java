package c13;

import java.util.Objects;
import java.util.Optional;

public class Person {

  private Person spouse;

  public void setSpouse(Person spouse) {
    this.spouse = Objects.requireNonNull(spouse);
  }

  public void removeSpouse() {
    spouse = null;
  }

  public Optional<Person> getSpouse() {
    return Optional.ofNullable(spouse);
  }

  public static void main(String[] args) {
    Person heinz = new Person();
    System.out.println(heinz.getSpouse().isEmpty()); // true
    Person eva = new Person();
    heinz.setSpouse(eva);
    System.out.println(heinz.getSpouse().isPresent()); // true
    System.out.println(heinz.getSpouse().get()); // com/.../Person
    heinz.removeSpouse();
    System.out.println(heinz.getSpouse().isEmpty()); // true
  }
}
