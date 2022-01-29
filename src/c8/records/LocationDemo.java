package c8.records;

public class LocationDemo {

  public static void main(String[] args) {
    Location manila = new Location(14.60416, 120.98222);
    System.out.printf("latitude=%f, longitude=%f%n", manila.latitude(), manila.longitude());

    System.out.println(manila);
    Location location1 = new Location(14.60416, 120.98222);
    System.out.println(location1.equals(manila));
    Location location2 = new Location(14, 120);
    System.out.println(location2.equals(manila));

    System.out.println(manila.toPoint());
    System.out.println(manila.withLatitude(14));
    System.out.println(manila.withLongitude(120));
    System.out.println(manila.longitude());
    System.out.println(manila);
    System.out.println(Location.isValid(15, 120));
    System.out.println(Location.isValid(200, 0));

    System.out.println(new Location(14.60416, 120.98222));
    try {
      System.out.println(new Location(-1000, +1000));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
