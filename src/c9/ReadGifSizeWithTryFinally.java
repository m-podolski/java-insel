package c9;

import java.io.*;

public class ReadGifSizeWithTryFinally {

  public static void printGifSize(String filename) throws FileNotFoundException, IOException {
    RandomAccessFile raf = new RandomAccessFile(filename, "r");
    try {
      raf.seek(6);
      System.out.printf("%s x %s Pixel%n", raf.read() + raf.read() * 256, raf.read() + raf.read() * 256);
    } finally {
      raf.close();
    }
  }

//  public static void main(String[] args)
//    throws FileNotFoundException, IOException {
//    printGifSize("duke.gif");
//  }

  public static void main(String[] args) {
    try (RandomAccessFile raf = new RandomAccessFile("duke.gif", "r")) {
      raf.seek(6);
      System.out.printf("%s x %s Pixel%n", raf.read() + raf.read() * 256, raf.read() + raf.read() * 256);
    } catch (IOException e) {
      System.err.println("Ein-/Ausgabefehler");
    }
  }
}