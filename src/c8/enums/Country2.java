package c8.enums;

public enum Country2 {

  GERMANY("DEU"), UK("GBR"), CHINA("CHN");
  private String iso3Country;

  Country2(String iso3Country) {
    this.iso3Country = iso3Country;
  }

  public String getISO3Country() {
    return iso3Country;
  }
}
