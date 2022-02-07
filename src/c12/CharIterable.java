package c12;

public interface CharIterable<E extends Exception> {

  boolean hasNext() throws E;

  char next() throws E;
}