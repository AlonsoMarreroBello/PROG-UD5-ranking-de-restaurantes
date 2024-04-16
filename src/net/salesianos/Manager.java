package net.salesianos;

import java.util.ArrayList;

import net.salesianos.utils.Window;

public class Manager {
  private static ArrayList<Restaurant> restaurants;

  public Manager() {
    Manager.restaurants = new ArrayList<>();
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
    Window.showMessage(Manager.restaurants.get(index).toString());
    String option = Window.askString("que fue mi niño, que quieres editar?");
    switch (option) {
      case "1":
        Manager.restaurants.get(index).setName(Window.askString("Introduzca el nuevo nombre"));
        break;
      case "2":
        Manager.restaurants.get(index).setLocation(Window.askString("Introduzca la nueva localizacion"));
        break;
      case "3":
        Manager.restaurants.get(index).setOpeningHours(Window.askString("Introduzca el horario"));
        break;
      case "4":
        Manager.restaurants.get(index).setRate(Window.askFloat("Introduzca la nueva calificación"));
        break;
    }
  }
  
  public static void editRestaurant(Restaurant restaurant) {
    Window.showMessage(restaurant.toString());
    int index = Manager.restaurants.indexOf(restaurant);
    String option = Window.askString("que fue mi niño, que quieres editar?");
    switch (option) {
      case "1":
        Manager.restaurants.get(index).setName(Window.askString("Introduzca el nuevo nombre"));
        break;
      case "2":
        Manager.restaurants.get(index).setLocation(Window.askString("Introduzca la nueva localizacion"));
        break;
      case "3":
        Manager.restaurants.get(index).setOpeningHours(Window.askString("Introduzca el horario"));
        break;
      case "4":
        Manager.restaurants.get(index).setRate(Window.askFloat("Introduzca la nueva calificación"));
        break;
    }
  }

  public static void showRestaurants() {
    String message = "";
    for (Restaurant restaurant : Manager.restaurants) {
      message += restaurant.toString(); 
    }
    Window.showMessage(message);
  }
  
}
