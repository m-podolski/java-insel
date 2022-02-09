package c13;

import java.util.function.IntFunction;

public class InnerVsLambdaThis {

  InnerVsLambdaThis() {
    Runnable lambdaRun = () -> System.out.println(this.getClass().getName());
    Runnable innerRun = new Runnable() {
      @Override
      public void run() {System.out.println(this.getClass().getName());}
    };
    lambdaRun.run(); // InnerVsLambdaThis
    innerRun.run(); // InnerVsLambdaThis$1
  }

  public static void main(String[] args) {
    new InnerVsLambdaThis();
  }
}

class RecursiveFactLambda {

  public static IntFunction<Integer> fact =
    n -> (n == 0) ? 1 : n * RecursiveFactLambda.fact.apply(n - 1);

  public static void main(String[] args) {
    System.out.println(fact.apply(5)); // 120
  }
}