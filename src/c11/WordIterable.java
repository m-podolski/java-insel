package c11;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class WordIterable implements Iterable<String>, Iterator<String> {

  private StringTokenizer st;

  public WordIterable(String s) {
    st = new StringTokenizer(s);
  }

  // Method from interface Iterable
  @Override public Iterator<String> iterator() {
    return this;
  }

  // Methods from interface Iterator
  @Override public boolean hasNext() {
    return st.hasMoreTokens();
  }

  @Override public String next() {
    if (hasNext()) {
      return st.nextToken();
    }
    throw new NoSuchElementException();
  }
}

class Demo {

  public static void main(String[] args) {
    String s = "Am Anfang war das Wort, am Ende die Phrase. (Stanislaw Jerzy Lec)";
    for (String word : new WordIterable(s))
      System.out.println(word);
//    Die erweiterte for -Schleife baut der Java - Compiler intern um zu:
    {
      String word;
      Iterator<String> iterator = new WordIterable(s).iterator();
      while (iterator.hasNext()) {
        word = iterator.next();
        System.out.println(word);
      }
      word = null;
      iterator = null;
    }
  }
}