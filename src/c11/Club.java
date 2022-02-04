package c11;

public class Club {

  int numberOfPersons;
  int location;

  @Override public boolean equals(Object o) {
    if (o == null) return false;
    if (o == this) return true;

//    if (!(o instanceof Club)) return false;
// club.equals( superClub ) == true
// superClub.equals( club ) == false

    if (o.getClass() != getClass()) return false;

    Club that = (Club) o;
    return this.numberOfPersons == that.numberOfPersons
      && this.location == that.location;

  }

  @Override
  public int hashCode() {
    return 31 * numberOfPersons + location;
  }
}

