package net.salesianos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.salesianos.utils.Validation;
import net.salesianos.utils.Window;

public class Menu {
  public static void addRestaurant() {
    String name = Window.askString("Enter the name of the restaurant:");
    String location = Window.askString("Enter the location of the restaurant:");
    String hours = Window.askString("Enter the hours of operation of the restaurant:");
    float rating;
    do {
      String ratingStr = Window.askString("Enter the rating of the restaurant:");
      if (Validation.isNumber(ratingStr)) {
        rating = Float.parseFloat(ratingStr);
        break;
      } else {
        JOptionPane.showMessageDialog(null, "Rating must be a number.");
      }
    } while (true);

    Restaurant restaurant = new Restaurant(name, location, hours, rating);
    Manager.addRestaurant(restaurant);
    Window.showMessage("Restaurant added successfully.");
  }

  public static void editRestaurant() {
    ArrayList<Restaurant> restaurants = Manager.getRestaurants();
    if (Validation.isListEmpty(restaurants)) {
      Window.showMessage("No restaurants to edit.");
      return;
    }

    String nameToFind = Window.askString("Enter the name of the restaurant to edit:");
    Restaurant restaurantToEdit = findRestaurantByName(nameToFind, restaurants);

    if (restaurantToEdit == null) {
      Window.showMessage("Restaurant not found.");
      return;
    }

    String newName = null, newLocation = null, newHours = null;
    float newRating = -1;

    newName = Window.askString("Enter the new name of the restaurant:");
    newLocation = Window.askString("Enter the new location of the restaurant:");
    newHours = Window.askString("Enter the new hours of operation of the restaurant:");
    String ratingStr;
    do {
      ratingStr = Window.askString("Enter the new rating of the restaurant:");
      if (Validation.isNumber(ratingStr)) {
        newRating = Float.parseFloat(ratingStr);
        break;
      } else {
        Window.showMessage("Rating must be a number.");
      }
    } while (true);

    if (!Validation.isValidString(newName)) newName = null;
    if (!Validation.isValidString(newLocation)) newLocation = null;
    if (!Validation.isValidString(newHours)) newHours = null;

    if (newName != null) restaurantToEdit.setName(newName);
    if (newLocation != null) restaurantToEdit.setLocation(newLocation);
    if (newHours != null) restaurantToEdit.setHours(newHours);
    if (newRating != -1) restaurantToEdit.setRating(newRating);

    Window.showMessage("Restaurant edited successfully.");
  }

  public static void deleteRestaurant() {
    ArrayList<Restaurant> restaurants = Manager.getRestaurants();
    if (Validation.isListEmpty(restaurants)) {
      Window.showMessage("No restaurants to delete.");
      return;
    }

    String nameToDelete = JOptionPane.showInputDialog("Enter the name of the restaurant to delete:");
    Restaurant restaurantToDelete = findRestaurantByName(nameToDelete, restaurants);

    if (restaurantToDelete == null) {
      Window.showMessage("Restaurant not found.");
      return;
    }

    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + nameToDelete + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
      int indexToDelete = restaurants.indexOf(restaurantToDelete);
      Manager.deleteRestaurant(indexToDelete);
      Window.showMessage("Restaurant deleted successfully.");
    }
  }

  public static Restaurant findRestaurantByName(String name, ArrayList<Restaurant> restaurants) {
    if (!Validation.isValidString(name)) {
      Window.showMessage("Invalid restaurant name.");
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
