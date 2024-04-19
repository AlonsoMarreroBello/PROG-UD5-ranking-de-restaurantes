package net.salesianos.utils;

import java.util.ArrayList;

public class Validation {
  public static boolean isNumber(String input) {
    try {
      Float.parseFloat(input);
      return true;
    } catch (NullPointerException | NumberFormatException e) {
      return false;
    }
  }

  public static boolean isValidIndex(int index, int size) {
    return index >= 0 && index < size;
  }

  public static boolean isListEmpty(ArrayList<?> list) {
    return list == null || list.isEmpty();
  }

  public static boolean isValidString(String input) {
    return input != null && !input.trim().isEmpty();
  }
}
