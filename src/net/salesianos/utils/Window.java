package net.salesianos.utils;

import javax.swing.JOptionPane;

public class Window {

  public Window() {
  }
  
  public static String askString(String message) {
    return JOptionPane.showInputDialog(message);
  }
  
  public static float askFloat(String message) {
    float number = Float.parseFloat(JOptionPane.showInputDialog(message));
    return number;
  }

  public static void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  
}
