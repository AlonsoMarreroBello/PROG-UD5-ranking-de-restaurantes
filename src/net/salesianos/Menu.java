package net.salesianos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import net.salesianos.utils.Validation;

public class Menu {
  public static void addRestaurant() {
    String name = JOptionPane.showInputDialog("Enter the name of the restaurant:");
    String location = JOptionPane.showInputDialog("Enter the location of the restaurant:");
    String hours = JOptionPane.showInputDialog("Enter the hours of operation of the restaurant:");
    float rating;
    do {
      String ratingStr = JOptionPane.showInputDialog("Enter the rating of the restaurant:");
      if (Validation.isNumber(ratingStr)) {
        rating = Float.parseFloat(ratingStr);
        break;
      } else {
        JOptionPane.showMessageDialog(null, "Rating must be a number.");
      }
    } while (true);

    Restaurant restaurant = new Restaurant(name, location, hours, rating);
    Manager.addRestaurant(restaurant);
    JOptionPane.showMessageDialog(null, "Restaurant added successfully.");
  }

  public static void editRestaurant() {
    ArrayList<Restaurant> restaurants = Manager.getRestaurants();
    if (Validation.isListEmpty(restaurants)) {
      JOptionPane.showMessageDialog(null, "No restaurants to edit.");
      return;
    }

    String nameToFind = JOptionPane.showInputDialog("Enter the name of the restaurant to edit:");
    Restaurant restaurantToEdit = findRestaurantByName(nameToFind, restaurants);

    if (restaurantToEdit == null) {
      JOptionPane.showMessageDialog(null, "Restaurant not found.");
      return;
    }

    String newName = null, newLocation = null, newHours = null;
    float newRating = -1;

    newName = JOptionPane.showInputDialog("Enter the new name of the restaurant:");
    newLocation = JOptionPane.showInputDialog("Enter the new location of the restaurant:");
    newHours = JOptionPane.showInputDialog("Enter the new hours of operation of the restaurant:");
    String ratingStr;
    do {
      ratingStr = JOptionPane.showInputDialog("Enter the new rating of the restaurant:");
      if (Validation.isNumber(ratingStr)) {
        newRating = Float.parseFloat(ratingStr);
        break;
      } else {
        JOptionPane.showMessageDialog(null, "Rating must be a number.");
      }
    } while (true);

    if (!Validation.isValidString(newName)) newName = null;
    if (!Validation.isValidString(newLocation)) newLocation = null;
    if (!Validation.isValidString(newHours)) newHours = null;

    if (newName != null) restaurantToEdit.setName(newName);
    if (newLocation != null) restaurantToEdit.setLocation(newLocation);
    if (newHours != null) restaurantToEdit.setHours(newHours);
    if (newRating != -1) restaurantToEdit.setRating(newRating);

    JOptionPane.showMessageDialog(null, "Restaurant edited successfully.");
  }

  public static void deleteRestaurant() {
    ArrayList<Restaurant> restaurants = Manager.getRestaurants();
    if (Validation.isListEmpty(restaurants)) {
      JOptionPane.showMessageDialog(null, "No restaurants to delete.");
      return;
    }

    String nameToDelete = JOptionPane.showInputDialog("Enter the name of the restaurant to delete:");
    Restaurant restaurantToDelete = findRestaurantByName(nameToDelete, restaurants);

    if (restaurantToDelete == null) {
      JOptionPane.showMessageDialog(null, "Restaurant not found.");
      return;
    }

    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + nameToDelete + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
      int indexToDelete = restaurants.indexOf(restaurantToDelete);
      Manager.deleteRestaurant(indexToDelete);
      JOptionPane.showMessageDialog(null, "Restaurant deleted successfully.");
    }
  }

  public static Restaurant findRestaurantByName(String name, ArrayList<Restaurant> restaurants) {
    if (!Validation.isValidString(name)) {
      JOptionPane.showMessageDialog(null, "Invalid restaurant name.");
      return null;
    }

    for (Restaurant restaurant : restaurants) {
      if (restaurant.getName().equalsIgnoreCase(name)) {
        return restaurant;
      }
    }
    return null;
  }
}
