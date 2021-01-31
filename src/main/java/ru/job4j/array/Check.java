package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
          for (int i = 0; i <= data.length - 1; i++) {
                  if (data[i] != result) {
                      result = false;
                      break;
                  }
          }
        return result;
    }
}
