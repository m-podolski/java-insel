package c9;

import java.net.URI;
import java.net.URISyntaxException;

public class Rethrow {

  public static void createUriFromHost(String host) throws URISyntaxException {
    try {
      new URI("http://" + host);
    } catch (URISyntaxException e) {
      System.err.println("Hilfe! " + e.getMessage());
      e.fillInStackTrace();
      throw e;
    }
  }

  public static void main(String[] args) {
    try {
      createUriFromHost("tutego.de");
      createUriFromHost("%");
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }
}
