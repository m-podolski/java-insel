package c12;

import java.util.*;

public class WhereToUseDiamond {

  public static List<String> foo(List<String> list) {
    return new ArrayList<>();
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list = new ArrayList<>();
    foo(new ArrayList<>(list));
  }
}