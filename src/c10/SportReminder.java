package c10;

import java.util.Timer;
import java.util.TimerTask;

public class SportReminder {

  public static void main(String[] args) {
    class SportReminderTask extends TimerTask {

      @Override public void run() {
        System.out.println("Los, beweg dich, du faule Wurst!");
      }
    }
    new Timer().scheduleAtFixedRate(new SportReminderTask(), 0 /* ms delay */, 1000 /* ms period */);
  }
}

class ShorterSportsReminder {

  public static void main(String[] args) {

    new Timer().scheduleAtFixedRate(new TimerTask() {
      @Override public void run() {
        System.out.println("Los, ...");
      }
    }, 0 /* ms delay */, 1000 /* ms period */);
  }
}

class ObjectWithQuote {

  public static void main(String[] args) {
    String s = new Object() {
      String quote(String s) {
        return String.format("'%s'", s);
      }
    }.quote("Cora");
    System.out.println(s); // 'Cora'
  }
}