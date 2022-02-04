package c11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorThenComparing {

  public static class Person {

    public String firstname, lastname;

    public Person(String firstname, String lastname) {
      this.firstname = firstname;
      this.lastname = lastname;
    }

    @Override public String toString() {
      return firstname + " " + lastname;
    }
  }

  public static final Comparator<Person> PERSON_FIRSTNAME_COMPARATOR = new Comparator<Person>() {
    public int compare(Person p1, Person p2) {
      return p1.firstname.compareTo(p2.firstname);
    }
  };
  public static final Comparator<Person> PERSON_LASTNAME_COMPARATOR = new Comparator<Person>() {
    public int compare(Person p1, Person p2) {
      return p1.lastname.compareTo(p2.lastname);
    }
  };

  public static void main(String[] args) {
    List<Person> persons = Arrays.asList(new Person("Onkel", "Ogar"), new Person("Olga", "Ogar"), new Person("Peter", "Lustig"), new Person("Lara", "Lustig"));
    persons.sort(PERSON_LASTNAME_COMPARATOR);
    System.out.println(persons);
    persons.sort(PERSON_FIRSTNAME_COMPARATOR);
    System.out.println(persons);
    persons.sort(PERSON_LASTNAME_COMPARATOR.thenComparing(PERSON_FIRSTNAME_COMPARATOR));
    System.out.println(persons);
  }
}
