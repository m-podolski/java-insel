package c8.interfaces;

abstract class Event implements EventLifecycle {

  String about;
  int duration;

  abstract void process();

  @Override public void start() {
  }

  @Override public void finish() {
  }

}
