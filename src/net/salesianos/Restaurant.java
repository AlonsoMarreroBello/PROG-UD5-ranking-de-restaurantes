package net.salesianos;

class Restaurant {
  private String name;
  private String location;
  private String hours;
  private float rating;

  public Restaurant(String name, String location, String hours, float rating) {
    this.name = name;
    this.location = location;
    this.hours = hours;
    this.rating = rating;
  }

  // Getters and setters

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

  public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "\nRestaurante: \n" + 
        "Nombre = " + name + '\n' +
        "Ubicacion = " + location + '\n' +
        "Horas = " + hours + '\n' +
        "Calificación = " + rating;
  }
}

