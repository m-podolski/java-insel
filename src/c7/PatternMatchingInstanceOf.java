package c7;

public class PatternMatchingInstanceOf {

  static boolean burnedSameCalories(Event event1, Event event2) {
    if (event1 instanceof Workout && event2 instanceof Workout) {
      Workout workout1 = (Workout) event1;
      Workout workout2 = (Workout) event2;
      return workout1.caloriesBurned == workout2.caloriesBurned;
    }
    return false;
  }

  static boolean burnedSameCaloriesPmatched(Event event1, Event event2) {
    if (event1 instanceof Workout workout1 && event2 instanceof Workout workout2) {
      return workout1.caloriesBurned == workout2.caloriesBurned;
    }
    return false;
  }
}
