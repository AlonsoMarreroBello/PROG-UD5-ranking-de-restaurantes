package net.salesianos;

public class Restaurant {
  private String name;
  private String location;
  private String openingHours;
  private int rate;

  public Restaurant(String name, String location, String openingHours, int rate) {
    this.name = name;
    this.location = location;
    this.openingHours = openingHours;
    this.rate = rate;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public String getOpeningHours() {
    return openingHours;
  }
  public void setOpeningHours(String openingHours) {
    this.openingHours = openingHours;
  }
  public int getRate() {
    return rate;
  }
  public void setRate(int rate) {
    this.rate = rate;
  }

  
}
