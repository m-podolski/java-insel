package c3;

import java.awt.Point;
import java.util.Arrays;

// let all initial positions be random
// split up into methods

// Ersetze das Array durch eine dynamische Datenstruktur vom Typ ArrayList<Point>.
// Nach jedem zweiten Schritt vom Benutzer soll die Länge der Schlage um eins wachsen.
// Wenn der Spieler ein Goldstück einsammelt, soll die Länge der Schlange um eins schrumpfen.

public class Snake {

  public static void main(String[] args) {
    Point playerPosition = new Point(10, 9);
    Point goldPosition = new Point(6, 6);
    Point doorPosition = new Point(0, 5);
    Point[] snakePositions = new Point[5];
    int snakeIdx = 0;
    snakePositions[snakeIdx] = new Point(30, 2);
    boolean rich = false;

    while (true) {
      // Raster mit Figuren zeichnen
      for (int y = 0; y < 10; y++) {
        for (int x = 0; x < 40; x++) {
          Point p = new Point(x, y);
          if (playerPosition.equals(p))
            System.out.print('&');
          else if (Arrays.asList(snakePositions).contains(p))
            System.out.print('S');
          else if (goldPosition.equals(p))
            System.out.print('$');
          else if (doorPosition.equals(p))
            System.out.print('#');
          else System.out.print('.');
        }
        System.out.println();
      }

      // Status feststellen
      if (rich && playerPosition.equals(doorPosition)) {
        System.out.println("Gewonnen!");
        return;
      }
      if (Arrays.asList(snakePositions).contains(playerPosition)) {
        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
        return;
      }
      if (playerPosition.equals(goldPosition)) {
        rich = true;
        goldPosition.setLocation(-1, -1);
      }

      // Konsoleneingabe und Spielerposition verändern
      switch (new java.util.Scanner(System.in).next()) {
        // Spielfeld ist im Bereich 0/0 .. 39/9
        case "w" -> playerPosition.y = Math.max(0, playerPosition.y - 1);
        case "s" -> playerPosition.y = Math.min(9, playerPosition.y + 1);
        case "a" -> playerPosition.x = Math.max(0, playerPosition.x - 1);
        case "d" -> playerPosition.x = Math.min(39, playerPosition.x + 1);
      }

      // Schlange bewegt sich in Richtung Spieler
      Point snakeHead = new Point(snakePositions[snakeIdx].x,
          snakePositions[snakeIdx].y);
      if (playerPosition.x < snakeHead.x)
        snakeHead.x--;
      else if (playerPosition.x > snakeHead.x)
        snakeHead.x++;
      if (playerPosition.y < snakeHead.y)
        snakeHead.y--;
      else if (playerPosition.y > snakeHead.y)
        snakeHead.y++;
      snakeIdx = (snakeIdx + 1) % snakePositions.length;
      snakePositions[snakeIdx] = snakeHead;
    } // end while
  }
}
