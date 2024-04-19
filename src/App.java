import net.salesianos.Manager;

import net.salesianos.Menu;
import net.salesianos.utils.Validation;
import net.salesianos.utils.Window;

public class App {
  public static void main(String[] args) {
    try {
      int choice = 0;
      do {
        String choiceStr = Window.askString(
          "Menu:\n" +
              "1. Add restaurant\n" +
              "2. Edit restaurant\n" +
              "3. Show restaurants\n" +
              "4. Delete restaurant\n" +
              "5. Exit"
      );
      if (Validation.isValidString(choiceStr)) {
        choice = Integer.parseInt(choiceStr);
        
        switch (choice) {
          case 1:
            Menu.addRestaurant();
            break;
          case 2:
            Menu.editRestaurant();
            break;
          case 3:
            Manager.showRestaurants();
            break;
          case 4:
            Menu.deleteRestaurant();
            break;
          case 5:
            System.out.println("Exiting the program...");
            break;
          default:
            System.out.println("Invalid option.");
        }
      }
      } while (choice != 5);
    } catch (Exception e) {
      System.out.println("An unexpected error occurred: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
