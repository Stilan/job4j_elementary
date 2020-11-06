package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int numberOfMatches = 11;
        Scanner scanner = new Scanner(System.in);
        boolean queue =  true;
        String name;
         while (numberOfMatches>0) {
                 name = queue ? " № 1" : " № 2";
                 System.out.println("Ход игрока " + name);
                 int matches = Integer.valueOf(scanner.nextLine());
                  if (matches >= 1 && matches <= 3) {
                      numberOfMatches -= matches;
                      System.out.println("Осталось " + numberOfMatches);
                      queue = !queue;
             }else {
                      System.out.println("Введите число от 1 до 3");
                      queue = queue;
                  }
         }
        name = queue ? "Победа игрока № 2" : "Победа игрока № 1";
        System.out.println(name);

    }
}
