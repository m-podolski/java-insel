package c8.interfaces;

interface EventLifecycle {

  void start();

  void finish();

  default void pause() {
  }

  ;
}
