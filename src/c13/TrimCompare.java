package c13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TrimCompare {

  public static void main(String[] args) {
    class TrimComparator implements Comparator<String> {

      @Override public int compare(String s1, String s2) {
        return s1.trim().compareTo(s2.trim());
      }
    }
    String[] words = {"M", "\nSkyfall", " Q", "\t\tAdele\t"};

    Arrays.sort(words, new TrimComparator());

    Arrays.sort(words, new Comparator<String>() {
      @Override public int compare(String s1, String s2) {
        return s1.trim().compareTo(s2.trim());
      }
    });

    Comparator<String> c = (String s1, String s2) -> {
      return s1.trim().compareTo(s2.trim());
    };
    Arrays.sort(words, c);

    Arrays.sort(words, (String s1, String s2) -> {
      return s1.trim().compareTo(s2.trim());
    });

    System.out.println(Arrays.toString(words));

    /*final*/
    boolean ignoreCase = new Scanner(System.in).nextBoolean();
    Comparator<String> d = (s1, s2) -> ignoreCase ?
      s1.trim().compareToIgnoreCase(s2.trim()) :
      s1.trim().compareTo(s2.trim());
    String[] words2 = {"M", "\nSkyfall", " Q", "\t\tAdele\t"};
    Arrays.sort(words2, d);
    System.out.println(Arrays.toString(words2));
  }
}
