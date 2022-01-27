package c7;

abstract public class Event {

  String about;
  int duration;

  protected abstract void process(Player player);

  @Override public String toString() {
    return String.format("%s[about=%s, duration=%d]",
      getClass().getSimpleName(), about, duration);
  }
}
