package c7;

public class DynamicBinding {

  public static void main(String[] args) {
    Workout ww = new Workout();
    ww.about = "Running";
    ww.duration = 100;
    ww.caloriesBurned = 300;
    System.out.println(ww);

    Event ew = new Workout();
    ew.about = "Running";
    ew.duration = 100;
    System.out.println(ew);

    Object ow = new Workout();
    System.out.println(ow);
  }
}
