package c13;

import java.util.Timer;
import java.util.TimerTask;

class TimerTaskLambda {

  public static TimerTaskLambda createTimerTask(Runnable runnable) {
    return new TimerTaskLambda() {
      public void run() {runnable.run();}
    };
  }

  public static void main(String[] args) {
//    new Timer().schedule(createTimerTask(() -> System.out.println("Hi")), 500);
  }
}

public class LambdaTimerTask extends TimerTask {

  private final Runnable runnable;

  public LambdaTimerTask(Runnable runnable) {
    this.runnable = runnable;
  }

  @Override public void run() {runnable.run();}

  public static void main(String[] args) {
    new Timer().schedule(new LambdaTimerTask(() -> System.out.println("Hi")), 500);
  }
}