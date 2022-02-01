package c9;

public class NotCloseable implements AutoCloseable {

  @Override public void close() {
    throw new UnsupportedOperationException("close() mag ich nicht");
  }
}

class SuppressedClosed {

  public static void main(String[] args) {
    try (NotCloseable res1 = new NotCloseable();
         NotCloseable res2 = new NotCloseable()) {
      throw new NullPointerException();
    }
  }
}