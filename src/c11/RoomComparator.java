package c11;

import java.util.Comparator;

class RoomComparator implements Comparator<Room> {

  @Override public int compare(Room room1, Room room2) {
    return Integer.compare(room1.getSqm(), room2.getSqm());
  }
}
