package c8.records;

import java.awt.geom.Point2D;

public record Location(double latitude, // Komponenten im Header
                       double longitude) {

  // -- Schreibweise 1 -----------------------------------------
//  public Location {
//    if (!isValid(latitude, longitude)) {
//      throw new IllegalArgumentException("Invalid range");
//    }
//  }

  // -- Schreibweise 2 -----------------------------------------
//  public Location(double latitude, double longitude) {
//    if (!isValid(latitude, longitude)) {
//      throw new IllegalArgumentException("Invalid range");
//    }
//    this.latitude = latitude;
//    this.longitude = longitude;
//  }

  public Location(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public Location(Point2D point) {
    this(point.y, point.x);
  }

  public Location() {
    this(0, 0);
  }

  public static Location fromPoint(Point2D point) {
    return new Location(point.y, point.x);
  }

  Point2D.Double toPoint() {
    return new Point2D.Double(longitude, latitude);
  }

  Location withLatitude(double latitude) {
    return new Location(longitude, latitude);
  }

  Location withLongitude(double longitude) {
    return new Location(longitude, latitude);
  }

  @Override public double longitude() {
    System.out.println("Access" + longitude);
    return longitude;
  }

  @Override public String toString() {
    return latitude + "," + longitude;
  }

  static boolean isValid(double latitude, double longitude) {
    return (-90 <= latitude && latitude <= +90) && (-180 <= longitude && longitude <= +180);
  }
}