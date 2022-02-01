package c9;

import java.io.*;

public class ReadGifSizeCatchingExceptions {

  public static void main(String[] args) {
    RandomAccessFile raf = null;
    try {
      raf = new RandomAccessFile("duke.gif", "r");
      raf.seek(6);
      System.out.printf("%s x %s Pixel%n", raf.read() + raf.read() * 256,
        raf.read() + raf.read() * 256);
    } catch (FileNotFoundException e) {
      System.err.println("Datei ist nicht vorhanden!");
    } catch (IOException e) {
      System.err.println("Allgemeiner Ein-/Ausgabefehler!");
    } finally {
      if (raf != null) {
        try {
          raf.close();
        } catch (IOException e) {
        }
      }
    }
  }
}