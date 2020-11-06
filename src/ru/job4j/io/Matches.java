package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int numberOfMatches = 11;
        Scanner scanner = new Scanner(System.in);
        boolean queue =  true;
         while (numberOfMatches>0) {
             if (queue) {
                 System.out.println("Ход игрока № 1");
                 int matches = Integer.valueOf(scanner.nextLine());
                  if (matches == 1 || matches == 2 || matches == 3) {
                      numberOfMatches -= matches;
                      System.out.println("Осталось " + numberOfMatches);
                      queue = false;
                  }else {
                      System.out.println("Введите число от 1 до 3");
                      queue = true;
                  }

             }else {
                 System.out.println("Ход игрока № 2");
                 int matches = Integer.valueOf(scanner.nextLine());
                 if (matches == 1 || matches == 2 || matches == 3) {
                     numberOfMatches -= matches;
                     System.out.println("Осталось " + numberOfMatches);
                     queue = true;
                 }else {
                     System.out.println("Введите число от 1 до 3");
                     queue = false;
                 }
             }
         }
         if (!queue){
             System.out.println("Победа первого");
         }else {
             System.out.println("Победа второго");
         }

    }
}
