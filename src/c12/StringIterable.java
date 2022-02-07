package c12;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class StringIterable implements CharIterable<RuntimeException> {

  private final String string;
  private int pos;

  public StringIterable(String string) {
    this.string = string;
  }

  @Override public boolean hasNext() {
    return pos < string.length();
  }

  @Override public char next() {
    return string.charAt(pos++);
  }
}

class WebIterable implements CharIterable<IOException> {

  private final Reader reader;

  public WebIterable(String url) throws IOException {
    reader = new InputStreamReader(new URL(url).openStream());
  }

  @Override public boolean hasNext() throws IOException {
    return reader.ready();
  }

  @Override public char next() throws IOException {
    return (char) reader.read();
  }
}