package net.salesianos;

public class Restaurant {
  private String name;
  private String location;
  private String openingHours;
  private float rating;

  public Restaurant(String name, String location, String openingHours, int rating) {
    this.name = name;
    this.location = location;
    this.openingHours = openingHours;
    this.rating = rating;
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
  public float getrating() {
    return rating;
  }
  public void setrating(float rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "\nRestaurante: \n" + 
        "Nombre = " + name + '\n' +
        "Ubicacion = " + location + '\n' +
        "Horas = " + openingHours + '\n' +
        "Calificación = " + rating;
  }

  
}
