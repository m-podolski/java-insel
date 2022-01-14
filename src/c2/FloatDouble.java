// 2.3
package c2;

/**
 * FloatDouble
 */
public class FloatDouble {

  public static void main(String[] args) {

    System.out.println(Float.toHexString(20000000000F));
    System.out.println(Float.toHexString(20000000000F + 1F));
    System.out.println(Double.toHexString(20000000000D));
    System.out.println(Double.toHexString(20000000000D + 1D));
  }
}
