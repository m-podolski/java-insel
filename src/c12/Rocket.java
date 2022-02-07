package c12;

public class Rocket<T> {

  private T value;

  public Rocket() {
  }

  public Rocket(T value) {
    this.value = value;
  }

  public void set(T value) {
    this.value = value;
  }

  public T get() {
    return value;
  }

  public boolean isEmpty() {
    return value == null;
  }

  public void empty() {
    value = null;
  }
}

//public class Rocket {
//
//  private Object value;
//
//  public Rocket() {
//  }
//
//  public Rocket(Object value) {
//    this.value = value;
//  }
//
//  public void set(Object value) {
//    this.value = value;
//  }
//
//  public Object get() {
//    return value;
//  }
//
//  public boolean isEmpty() {
//    return value == null;
//  }
//
//  public void empty() {
//    value = null;
//  }
//}
