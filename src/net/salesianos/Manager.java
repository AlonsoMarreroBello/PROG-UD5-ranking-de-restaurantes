package net.salesianos;

import java.util.ArrayList;

public class Manager {
  private static ArrayList<Restaurant> restaurants;

  public Manager() {
    Manager.restaurants = new ArrayList<>();
  }

  public static ArrayList<Restaurant> getRestaurants() {
    return restaurants;
  }

  public static void setRestaurants(ArrayList<Restaurant> restaurants) {
    Manager.restaurants = restaurants;
  }

  public static void addRestaurant(Restaurant r) {
    Manager.restaurants.add(r);
  }

  public static void removeRestaurant(int index) {
    Manager.restaurants.remove(index);
  }

  public static void removeRestaurant(Restaurant restaurant) {
    Manager.restaurants.remove(restaurant);
  }

  public static void editRestaurant(int index) {
    // Show restaurant data on screen
    int option = 0;
    switch (option) {
      case 1:
        Manager.restaurants.get(index).setName(null);
        break;
      case 2:
        Manager.restaurants.get(index).setLocation(null);
        break;
      case 3:
        Manager.restaurants.get(index).setOpeningHours(null);
        break;
      case 4:
        int rate = 5;
        Manager.restaurants.get(index).setRate(rate);
        break;
    }
  }
  
  public static void editRestaurant(Restaurant restaurant) {
    // Show restaurant data on screen
    int index = Manager.restaurants.indexOf(restaurant);
    int option = 0;
    switch (option) {
      case 1:
        Manager.restaurants.get(index).setName(null);
        break;
      case 2:
        Manager.restaurants.get(index).setLocation(null);
        break;
      case 3:
        Manager.restaurants.get(index).setOpeningHours(null);
        break;
      case 4:
        int rate = 5;
        Manager.restaurants.get(index).setRate(rate);
        break;
    }
  }

  public static void showRestaurants() {
    String message = "";
    for (Restaurant restaurant : Manager.restaurants) {
      message += restaurant.toString(); 
    }
    // show message on screen
  }
  
}
