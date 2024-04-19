package net.salesianos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Manager {
  private static ArrayList<Restaurant> restaurants = new ArrayList<>();

  public static void addRestaurant(Restaurant restaurant) {
    restaurants.add(restaurant);
  }

  public static void editRestaurant(int index, Restaurant restaurant) {
    restaurants.set(index, restaurant);
  }

  public static void deleteRestaurant(int index) {
    restaurants.remove(index);
  }

  public static void showRestaurants() {
    Collections.sort(restaurants, Comparator.comparingDouble(Restaurant::getRating).reversed());
    String message = "";
    for (Restaurant restaurant : restaurants) {
      message += restaurant + "\n";
    }
    JOptionPane.showMessageDialog(null, message);
  }

  public static ArrayList<Restaurant> getRestaurants() {
    return restaurants;
  }
}
