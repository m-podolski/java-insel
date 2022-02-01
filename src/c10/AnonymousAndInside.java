package c10;

import java.util.HashMap;
import java.util.Map;

public class AnonymousAndInside {

  public static void main(String[] args) {
    java.awt.Point p = new java.awt.Point() {
      {
        x = (int) (Math.random() * 1000);
        y = (int) (Math.random() * 1000);
      }
    };
    System.out.println(p.getLocation()); // java.awt.Point[...
    System.out.println(new java.awt.Point(-1, 0) {{
      y = (int) (Math.random() * 1000);
    }}.getLocation());
  }
}

class MapDemo {

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<String, Object>() {{
      put("name", "Chris");
      put("address", new HashMap<String, Object>() {{
        put("street", "Feenallee 1");
        put("city", "Elefenberg");
      }});
    }};
  }
}