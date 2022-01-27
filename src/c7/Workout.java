package c7;

public class Workout extends Event {

  int caloriesBurned;

  protected void process(Player player) {
  }

  @Override public String toString() {
    return String.format("%s[caloriesBurned=%d]",
      super.toString(),
      caloriesBurned);
  }
}
