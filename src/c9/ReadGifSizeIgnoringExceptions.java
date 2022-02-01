package c9;

import java.io.*;

public class ReadGifSizeIgnoringExceptions {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    RandomAccessFile raf = new RandomAccessFile("duke.gif", "r");
    raf.seek(6);
    System.out.printf("%s x %s Pixel%n", raf.read() + raf.read() * 256, raf.read() + raf.read() * 256);
    raf.close();
  }
}