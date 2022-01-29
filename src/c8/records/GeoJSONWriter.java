package c8.records;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class GeoJSONWriter {

  static void printGeoJSONcoordinates(GeoJSONShape shape) {
    Objects.requireNonNull(shape);
    System.out.print("\"coordinates\": ");
    if (shape instanceof GeoJSONpoint point) {
      System.out.printf("{ \"type\": \"Point\", \"coordinates\": %s }%n", point.coordinate());
    } else if (shape instanceof GeoJSONline line) {
      System.out.printf("{ \"type\": \"LineString\", \"coordinates\": [ %s ] }%n", Arrays.stream(line.coordinates()).map(GeoJSONShape.Coordinate::toString).collect(Collectors.joining(",")));
    } else {
      throw new IllegalStateException("Unknown shape " + shape.getClass());
    }
  }
}