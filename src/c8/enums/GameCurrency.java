package c8.enums;

public enum GameCurrency {
  EURO() {
    @Override
    public double convertTo(GameCurrency targetCurrency, double value) {
      return targetCurrency == EURO ? value : value / 2;
    }
  }, PETRODOLLAR() {
    @Override
    public double convertTo(GameCurrency targetCurrency, double value) {
      return targetCurrency == PETRODOLLAR ? value : value * 2;
    }
  };

  public abstract double convertTo(GameCurrency targetCurrency, double value);
}

class GameCurrencyDemo {

  public static void main(String[] args) {
    System.out.println(GameCurrency.EURO.convertTo(GameCurrency.EURO, 12)); // 12.0
    System.out.println(GameCurrency.EURO.convertTo(GameCurrency.PETRODOLLAR, 12)); // 6.0
    System.out.println(GameCurrency.PETRODOLLAR.convertTo(GameCurrency.EURO, 12)); // 24.0
    System.out.println(GameCurrency.PETRODOLLAR.convertTo(GameCurrency.PETRODOLLAR, 12)); // 12.0
  }
}