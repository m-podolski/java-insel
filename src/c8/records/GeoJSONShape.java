package c8.records;

sealed interface GeoJSONShape permits GeoJSONpoint, GeoJSONline {

  record Coordinate(int x, int y) {

    @Override public String toString() {
      return '[' + x + "," + y + ']';
    }
  }
}

record GeoJSONpoint(Coordinate coordinate) implements GeoJSONShape {

}

record GeoJSONline(Coordinate... coordinates) implements GeoJSONShape {

}
