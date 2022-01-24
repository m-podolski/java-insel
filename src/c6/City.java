package c6;

import java.util.Objects;

public class City {

  private String name;
  private int population;
  public static final int KANDY_HERSHEY_DISTANCE = 124;

//  public final String finalName;
//
//  public City(String name) {
//    this.finalName = name;
//  }

//  public City(String name) {
//    setName(name);
//  }
//
//  public City(String name, int population) {
//    setName(name);
//    setPopulation(population);
//  }

  public City(String name, int population) {
    this.name = name.trim();
    this.population = Math.max(0, population);
  }

  public City(City other) {
    this(other.name, other.population);
  }

  public City() {
    this("Undefined", 0);
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public String getName() {
    return name;
  }

  public void setPopulation(int population) {
    if (population >= 0) {
      this.population = population;
    }
  }

  public int getPopulation() {
    return population;
  }

  public static int distance(String cityName1, String cityName2) {
    if (cityName1.equalsIgnoreCase(cityName2)) return 0;
    if ((cityName1.equalsIgnoreCase("kandy")
      && cityName2.equalsIgnoreCase("hershey"))
      || (cityName1.equalsIgnoreCase("hershey")
      && cityName2.equalsIgnoreCase("kandy"))) {
      return KANDY_HERSHEY_DISTANCE;
    }
    return -1;
  }

  public static void main(String[] args) {

    System.out.println(City.KANDY_HERSHEY_DISTANCE); // 124
//    City.KANDY_HERSHEY_DISTANCE = 120;
    System.out.println(City.KANDY_HERSHEY_DISTANCE); // 120
    System.out.println(City.distance("Kandy", "Hershey")); // 124
    System.out.println(City.distance("Neijiangs", "hershey")); // -1
    System.out.println(City.distance("kandy", "kandy"));
  }
}

class WitherCity {
  public final String name;
  public final int population;

  public WitherCity(String name, int population) {
    this.name = name;
    this.population = population;
  }

  public WitherCity withName(String name) {
    return new WitherCity(name, population);
  }

  public WitherCity withPopulation(int population) {
    return new WitherCity(name, population);
  }

  public static void main(String[] args) {
    WitherCity almostKandy = new WitherCity("H", 100);
    WitherCity kandy = almostKandy.withPopulation(10_200).withName("Hershey");
    System.out.printf("%s %d", kandy.name, kandy.population); // Hershey 10200
  }
}